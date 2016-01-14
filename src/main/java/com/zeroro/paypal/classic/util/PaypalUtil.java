package com.zeroro.paypal.classic.util;


import com.zeroro.paypal.classic.model.PaypalClassicModel;
import com.zeroro.paypal.classic.model.PaypalClassicResponseModel;
import com.zeroro.paypal.classic.model.annotation.PaypalCollection;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.util.*;

public class PaypalUtil {

    private static final Logger logger = LoggerFactory.getLogger(PaypalUtil.class);

    public static Map<String, String> toRequestMap(PaypalClassicModel paypalClassicModel) {
        return toRequestMap(paypalClassicModel, null);
    }

    public static Map<String, String> toRequestMap(List paypalClassicModelList, String format) {
        Map<String, String> returnMap = new HashMap<>();
        if (paypalClassicModelList != null) {
            for (int i = 0; i < paypalClassicModelList.size(); i++) {
                if (paypalClassicModelList.get(i) instanceof PaypalClassicModel) {
                    if (StringUtils.isNoneEmpty(format)) {
                        returnMap.putAll(toRequestMap((PaypalClassicModel) paypalClassicModelList.get(i),
                                format + String.valueOf(i)));
                    } else {
                        returnMap.putAll(toRequestMap((PaypalClassicModel) paypalClassicModelList.get(i), String
                                .valueOf(i)));
                    }
                }
                if (paypalClassicModelList.get(i) instanceof List) {
                    if (StringUtils.isNoneEmpty(format)) {
                        returnMap.putAll(toRequestMap((List) paypalClassicModelList.get(i),
                                format + String.valueOf(i)));
                    } else {
                        returnMap.putAll(toRequestMap((List) paypalClassicModelList.get(i), String
                                .valueOf(i)));
                    }
                }
            }
        }
        return returnMap;
    }

    public static Map<String, String> toRequestMap(PaypalClassicModel paypalClassicModel, String format) {
        Map<String, String> returnMap = new HashMap<>();
        if (paypalClassicModel == null) {
            return returnMap;
        }
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//        ValidatorFactory factory = Validation.byDefaultProvider()
//                .configure()
//                .messageInterpolator( new MyMessageInterpolator() )
//                .buildValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<PaypalClassicModel>> violations = validator.validate(paypalClassicModel);
        if (violations.size() == 0) {
            try {
                for (Field field : FieldUtils.getAllFields(paypalClassicModel.getClass())) {
                    if (field.getType().isAssignableFrom(String.class)) {
                        if (BeanUtils.getProperty(paypalClassicModel, field.getName()) != null) {
                            if (StringUtils.isNumeric(format)) {
                                returnMap.put(field.getName().toUpperCase() + format, BeanUtils.getProperty
                                        (paypalClassicModel, field.getName()));
                            } else {
                                returnMap.put(getFormatedKeyName(format, field.getName(), null), BeanUtils
                                        .getProperty(paypalClassicModel, field.getName()));
                            }
                        }
                    }
                    if (PaypalClassicModel.class.isAssignableFrom(field.getType())) {

                        if (PropertyUtils.getProperty(paypalClassicModel, field.getName()) != null) {
                            returnMap.putAll(toRequestMap((PaypalClassicModel) PropertyUtils.getProperty
                                    (paypalClassicModel, field.getName()), format));
                        }
                    }
                    if (List.class.isAssignableFrom(field.getType())) {
                        List listItem = (List) PropertyUtils.getProperty(paypalClassicModel, field.getName());
                        if (listItem != null) {
                            for (int i = 0; i < listItem.size(); i++) {
                                if (listItem.get(i) instanceof PaypalClassicModel) {
                                    PaypalCollection paypalCollection = field.getAnnotation(PaypalCollection.class);
                                    if (paypalCollection != null && StringUtils.isNotEmpty(paypalCollection.format())) {
                                        String formatStr = field.getAnnotation(PaypalCollection.class).format();
                                        returnMap.putAll(toRequestMap((PaypalClassicModel) listItem.get(i),
                                                getFormatedKeyName(formatStr, null, i)));
                                    } else {
                                        if (StringUtils.isNoneEmpty(format)) {
                                            returnMap.putAll(toRequestMap((PaypalClassicModel) listItem.get(i),
                                                    format + String.valueOf(i)));
                                        } else {
                                            returnMap.putAll(toRequestMap((PaypalClassicModel) listItem.get(i), String
                                                    .valueOf(i)));
                                        }

                                    }
                                }
                                if (listItem.get(i) instanceof List) {
                                    PaypalCollection paypalCollection = field.getAnnotation(PaypalCollection.class);
                                    if (paypalCollection != null && StringUtils.isNotEmpty(paypalCollection.format())) {
                                        String formatStr = field.getAnnotation(PaypalCollection.class).format();
                                        returnMap.putAll(toRequestMap((List) listItem.get(i),
                                                getFormatedKeyName(formatStr, null, i)));
                                    } else {
                                        if (StringUtils.isNoneEmpty(format)) {
                                            returnMap.putAll(toRequestMap((List) listItem.get(i),
                                                    format + String.valueOf(i)));
                                        } else {
                                            returnMap.putAll(toRequestMap((List) listItem.get(i), String
                                                    .valueOf(i)));
                                        }

                                    }
                                }
                                if (listItem.get(i) instanceof String) {
                                    PaypalCollection paypalCollection = field.getAnnotation(PaypalCollection.class);
                                    if (paypalCollection != null && StringUtils.isNotEmpty(paypalCollection.format())) {
                                        String formatStr = paypalCollection.format();
                                        formatStr = getFormatedKeyName(formatStr, field.getName(), i);
                                        returnMap.put(getFormatedKeyName(format, formatStr, null), listItem.get(i)
                                                .toString());
                                    } else {
                                        returnMap.put(getFormatedKeyName(format, field.getName(), null) + i, listItem
                                                .get(i).toString());
                                    }

                                }
                            }
                        }
                    }

                }
            } catch (IllegalAccessException e) {
                throw new ValidationException(e.getMessage());
            } catch (InvocationTargetException e) {
                throw new ValidationException(e.getMessage());
            } catch (NoSuchMethodException e) {
                throw new ValidationException(e.getMessage());
            }
        } else {
            StringBuffer buf = new StringBuffer();
            for (ConstraintViolation<PaypalClassicModel> violation : violations) {
                buf.append(violation.getMessage() + "\n");
            }
            throw new ValidationException(buf.toString());
        }
        return returnMap;
    }

    private static String getFormatedKeyName(String formatStr, String fieldName, Integer index) {
        if (formatStr != null) {
            formatStr = formatStr.toUpperCase();
            if (StringUtils.isNotEmpty(fieldName)) {

                formatStr = StringUtils.replace(formatStr, "{NAME}", fieldName);
            }
            if (index != null) {
                formatStr = StringUtils.replace(formatStr, "{INDEX}", String.valueOf(index));
            }
            return formatStr.toUpperCase();
        }
        return fieldName.toUpperCase();

    }


    public static String formatCreditCardExpDate(String expDate) {
        if (expDate.length() != 7) {
            return expDate;
        }
        return expDate.substring(5, 7) + expDate.substring(0, 4);
    }



    public static String formatCurrencyCode(String currencyCode) {
        return currencyCode;
    }

    public static <T extends PaypalClassicResponseModel> T convertToAPIResponse(Map<String, String> mapdata, Class<T>
            clazz) {
        if (mapdata == null) {
            return null;
        }
        T paypalClassicResponseModel = null;

        try {
            paypalClassicResponseModel = mapToClazz(mapdata, clazz);
        } catch (InstantiationException e) {
            throw new ValidationException(e.getMessage());
        } catch (IllegalAccessException e) {
            throw new ValidationException(e.getMessage());
        } catch (InvocationTargetException e) {
            throw new ValidationException(e.getMessage());
        }

        return paypalClassicResponseModel;
    }

    private static <T> T mapToClazz(Map<String, String> mapdata, Class<T> clazz) throws IllegalAccessException,
            InvocationTargetException, InstantiationException {
        return mapToClazz(mapdata, clazz, null);
    }

    private static <T> T mapToClazz(Map<String, String> map, Class<T> clazz, String formatStr)
            throws InstantiationException, IllegalAccessException, InvocationTargetException {
        Map<String, String> mapdata = getCaseInsensitveMap(map);
        T paypalClassicResponseModel;
        paypalClassicResponseModel = clazz.newInstance();
        for (Field field : FieldUtils.getAllFields(clazz)) {
            if (String.class.isAssignableFrom(field.getType())) {
                BeanUtils.setProperty(paypalClassicResponseModel, field.getName(), mapdata.get(getFormatedKeyName
                        (formatStr, field.getName(), null)));
            }

            if (List.class.isAssignableFrom(field.getType())) {
                PaypalCollection paypalCollection = field.getAnnotation(PaypalCollection.class);
                ParameterizedType ty = ((ParameterizedType) field.getGenericType());
                if (ty.getActualTypeArguments()[0] instanceof Class) {
                    Class subClazz = (Class<?>) ty.getActualTypeArguments()[0];
                    if (String.class.isAssignableFrom(subClazz)) {
                        if (paypalCollection != null && StringUtils.isNotEmpty(paypalCollection.format())) {
                            List<String> values = fetchPartialKey(mapdata, getFormatedKeyName(paypalCollection.format
                                    (), field.getName(), null));
                            BeanUtils.setProperty(paypalClassicResponseModel, field.getName(), values);
                        } else {
                            List<String> values = fetchPartialKey(mapdata, field.getName().toUpperCase());
                            BeanUtils.setProperty(paypalClassicResponseModel, field.getName(), values);
                        }
                    }
                    if (PaypalClassicModel.class.isAssignableFrom(subClazz)) {
                        if (paypalCollection != null && StringUtils.isNotEmpty(paypalCollection.format())) {
                            BeanUtils.setProperty(paypalClassicResponseModel, field.getName(), mapToClazzList
                                    (mapdata, subClazz, paypalCollection.format()));
                        }
                    }
                }

            }
            if (PaypalClassicModel.class.isAssignableFrom(field.getType())) {
                BeanUtils.setProperty(paypalClassicResponseModel, field.getName(), mapToClazz(mapdata, field.getType
                        ()));
            }

        }
        return paypalClassicResponseModel;
    }

    private static Map<String, String> getCaseInsensitveMap(Map<String, String> map) {
        Map<String, String> mapdata = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
        mapdata.putAll(map);
        return mapdata;
    }

    private static List mapToClazzList(Map<String, String> mapdata, Class subClazz, String formatStr) throws
            IllegalAccessException, InstantiationException, InvocationTargetException {
        Map<String, String> lookupMap = getCaseInsensitveMap(mapdata);
        List returnList = new ArrayList();
        int itemListLength = 0;
        //find the length of the list
        for (Field field : FieldUtils.getAllFields(subClazz)) {
            int i = 0;
            while (lookupMap.get(getFormatedKeyName(formatStr, field.getName(), i)) != null) {
                i++;
            }
            if (i > itemListLength) {
                itemListLength = i;
            }
        }
        //inital each item
        for (int i = 0; i < itemListLength; i++) {
            returnList.add(mapToClazz(lookupMap, subClazz, getFormatedKeyName(formatStr, null, i)));
        }
        return returnList;
    }

    //Consider return map in future.
    private static List<String> fetchPartialKey(Map<String, String> map, String key) {
        List<String> keywords = Arrays.asList(key.split("\\{INDEX\\}"));
        List<String> listStr = new ArrayList<>();

        for (Map.Entry<String, String> e : map.entrySet()) {
            String numStr = e.getKey().toUpperCase();
            for (String keyword : keywords) {
                numStr = StringUtils.remove(numStr, keyword);
            }
            if (NumberUtils.isDigits(numStr)) {
                listStr.add(e.getValue());
            }
        }
        return listStr;
    }


}


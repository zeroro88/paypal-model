package com.zeroro.paypal.classic.util;



public class HashBuilder
{
    public HashBuilder()
    {
        return;
    }

    protected int hashCode = 33;

    public
    void add (final byte b)
    {
        hashCode = hashCode * 17 + b;
        return;
    }

    public
    void add (final int i)
    {
        hashCode = hashCode * 17 + i;
        return;
    }

    public
    void add (final char i)
    {
    	final int a = (int) i;
        this.add(a);
        return;
    }
  
    public
    void add (final int [] is)
    {
        for (final int i : is) {
            add (i);
        }
        return;
    }

    public
    void add (final byte [] bs)
    {
        for (final byte b : bs) {
            add (b);
        }
        return;
    }

    public
    void add (final Object obj)
    {
        if (obj != null) {
            hashCode = hashCode * 17 + obj.hashCode ();
        }
        return;
    }

    public
    void add (final Object [] objs)
    {
        for (final Object obj : objs) {
            add (obj);
        }
        return;
    }

    public
    void add (final long l)
    {
        hashCode = hashCode * 17 + (int) (l ^ (l >>> 32));
        return;
    }

    public
    void add (final long [] ls) {
    	if( ls != null ){
	        for (final long l : ls) {
	            add (l);
	        }
    	}
        return;
    }

    public
    void add (final boolean b)
    {
        add (b ? 1 : 0);
        return;
    }

    public
    void add (final boolean [] bs)
    {
    	if( bs != null ){
	        for (final boolean b : bs) {
	            add (b);
	        }
    	}
        return;
    }

    public
    int getHashCode ()
    {
        return hashCode;
    }

    @Override
    public int hashCode ()
    {
		return hashCode; 
    }
 }

// EOF
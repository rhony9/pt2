package org.d3ifcool.angkotontheway;

/**
 * Created by Lathifah Zukhrufa A on 02/03/2018.
 */

public class Angkot {
    private String mRoute;
    private int mImageAngkot;
    private  String mStart;
    private String mEnd;

    public Angkot(String mRoute, int mImageAngkot) {
        this.mRoute = mRoute;
        this.mImageAngkot = mImageAngkot;
    }

    public Angkot(String mRoute, int mImageAngkot, String mStart, String mEnd) {
        this.mRoute = mRoute;
        this.mImageAngkot = mImageAngkot;
        this.mEnd = mEnd;
        this.mStart = mStart;
    }

    public String getmRoute() { return mRoute; }

    public int getmImageAngkot() { return mImageAngkot; }

    public String getmStart() { return mStart; }

    public String getmEnd() { return mEnd; }
}

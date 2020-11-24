package com.bignerdranch.android.criminalintent;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    String mCurrentDate;
    private boolean mSolved;

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public void setId(UUID mId) {
        this.mId = mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getDate() {
        Calendar calendar = Calendar.getInstance();
        mCurrentDate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        return mCurrentDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }
}

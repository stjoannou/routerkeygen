package org.exobel.routerkeygen.algorithms;

import android.os.Parcel;
import android.os.Parcelable;

import org.exobel.routerkeygen.R;

import java.util.List;
import java.util.Locale;

/**
 * Created by stelios on 13/12/2015.
 */
public class PrimetelKeygen extends Keygen {
    public static final Parcelable.Creator<PrimetelKeygen> CREATOR = new Parcelable.Creator<PrimetelKeygen>() {
        public PrimetelKeygen createFromParcel(Parcel in) {
            return new PrimetelKeygen(in);
        }

        public PrimetelKeygen[] newArray(int size) {
            return new PrimetelKeygen[size];
        }
    };

    public PrimetelKeygen(String ssid, String mac) {
        super(ssid, mac);
    }

    private PrimetelKeygen(Parcel in) {
        super(in);
    }

    @Override
    public List<String> getKeys() {
        if (getMacAddress().length() != 12) {
            setErrorCode(R.string.msg_nomac);
            return null;
        }

//        addPassword(wep + hex);
        return getResults();
    }

}

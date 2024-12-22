package com.aliendroid.alienads;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.BannerAdSize;
import com.huawei.hms.ads.HwAds;
import com.huawei.hms.ads.banner.BannerView;


public class AliendroidMediumBanner {
    public static BannerView bannerView;

    public static void MediumBannerAdmob(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup, String Hpk1,
                                         String Hpk2, String Hpk3, String Hpk4, String Hpk5) {

        HwAds.init(activity);
        bannerView = new BannerView(activity);
        bannerView.setAdId(idBanner);
        bannerView.setBannerAdSize(BannerAdSize.BANNER_SIZE_300_250);
        layAds.addView(bannerView);
        bannerView.loadAd(new AdParam.Builder().build());

    }

    public static void MediumBannerGoogleAds(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {



    }


    public static void MediumBannerFAN(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {
    }

    public static void MediumBannerApplovinDisHPK(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup, String HPK1,
                                                  String HPK2, String HPK3, String HPK4, String HPK5) {

    }

    public static void MediumBannerApplovinDis(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {

    }

    public static void MediumBannerApplovinMax(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {
    }

    public static void MediumBannerMopub(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {


    }

    public static void MediumBannerStartApp(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {
    }

    public static void MediumBannerIron(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {
    }

    public static void MediumBannerUnity(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {
    }

    public static void MediumBannerAlienMediation(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {
    }
}

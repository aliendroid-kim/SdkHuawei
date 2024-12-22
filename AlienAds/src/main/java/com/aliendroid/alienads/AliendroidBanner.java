package com.aliendroid.alienads;


import android.app.Activity;
import android.widget.RelativeLayout;

import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.BannerAdSize;
import com.huawei.hms.ads.HwAds;
import com.huawei.hms.ads.banner.BannerView;

public class AliendroidBanner {
    public static BannerView bannerView;
    public static void SmallBannerAdmob(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup, String Hpk1,
                                        String Hpk2, String Hpk3, String Hpk4, String Hpk5) {
        HwAds.init(activity);
        bannerView = new BannerView(activity);
        bannerView.setAdId(idBanner);
        bannerView.setBannerAdSize(BannerAdSize.BANNER_SIZE_320_50);
        layAds.addView(bannerView);
        bannerView.loadAd(new AdParam.Builder().build());
    }

    public static void SmallBannerGoogleAds(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {

    }


    public static void SmallBannerFAN(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {

    }

    public static void SmallBannerApplovinDisHPK(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup, String HPK1,
                                                 String HPK2, String HPK3, String HPK4, String HPK5) {
    }

    public static void SmallBannerApplovinDis(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {

    }

    public static void SmallBannerApplovinMax(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {

    }

    public static void SmallBannerMopub(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {

    }

    public static void SmallBannerStartApp(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {
    }

    public static void SmallBannerIron(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {

    }

    public static void SmallBannerUnity(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {
    }

    public static void SmallBannerAlienView(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {

    }

    public static void SmallBannerAlienMediation(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {
    }

    public static void SmallCollapsibleAdmobTop(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup, String Hpk1,
                                                String Hpk2, String Hpk3, String Hpk4, String Hpk5) {

    }

    public static void SmallCollapsibleAdmobBottom(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup, String Hpk1,
                                                   String Hpk2, String Hpk3, String Hpk4, String Hpk5) {

    }

    public static void SmallBannerWortise(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {

    }

}

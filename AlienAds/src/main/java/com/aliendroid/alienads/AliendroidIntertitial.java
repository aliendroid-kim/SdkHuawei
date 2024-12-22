package com.aliendroid.alienads;


import android.app.Activity;

import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.HwAds;
import com.huawei.hms.ads.InterstitialAd;


public class AliendroidIntertitial {
    public static InterstitialAd interstitialAd;
    public static int counter = 0;
    public static void LoadIntertitialUnity(Activity activity, String selectAds, String idIntertitial, String idBackupIntertitial) {

        HwAds.init(activity);
        interstitialAd = new InterstitialAd(activity);
        interstitialAd.setAdId(idIntertitial);
        AdParam adParam = new AdParam.Builder().build();
        interstitialAd.loadAd(adParam);
    }

    public static void LoadIntertitialAdmob(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup, String Hpk1,
                                            String Hpk2, String Hpk3, String Hpk4, String Hpk5) {

        HwAds.init(activity);
        interstitialAd = new InterstitialAd(activity);
        interstitialAd.setAdId(idIntertitial);
        AdParam adParam = new AdParam.Builder().build();
        interstitialAd.loadAd(adParam);
    }

    public static void LoadIntertitialGoogleAds(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {



    }

    public static void LoadIntertitialFAN(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {

    }

    public static void LoadIntertitialApplovinDis(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup
    ) {

    }

    public static void LoadIntertitialApplovinDisHPK(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                                     String HPK1,
                                                     String HPK2, String HPK3, String HPK4, String HPK5
    ) {

    }

    public static void LoadIntertitialApplovinMax(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {

    }

    public static void LoadIntertitialIron(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {

    }

    public static void LoadIntertitialMopub(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {
    }

    public static void LoadIntertitialStartApp(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {

    }

    public static void ShowIntertitialAdmob(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                            int interval, String Hpk1,
                                            String Hpk2, String Hpk3, String Hpk4, String Hpk5) {
        if (counter >= interval) {
            if (interstitialAd != null && interstitialAd.isLoaded()) {
                interstitialAd.show(activity);
            } else {
                LoadIntertitialAdmob(activity, selectAdsBackup, idIntertitial, idIntertitialBackup, Hpk1, Hpk2, Hpk3, Hpk4, Hpk5);
            }
             counter = 0;
        } else {
            counter++;
        }
    }

    public static void ShowIntertitialGoogleAds(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                                int interval) {
    }

    public static void ShowIntertitialApplovinDis(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                                  int interval) {
    }

    public static void ShowIntertitialApplovinDisHPK(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                                     int interval, String HPK1,
                                                     String HPK2, String HPK3, String HPK4, String HPK5) {
    }

    public static void ShowIntertitialApplovinMax(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                                  int interval) {
    }

    public static void ShowIntertitialIron(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                           int interval) {
    }

    public static void ShowIntertitialMopub(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                            int interval) {

    }


    public static void ShowIntertitialSartApp(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                              int interval) {
    }


    public static void ShowIntertitialFAN(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                          int interval) {
    }

    public static void ShowIntertitialUnity(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                            int interval) {
    }

    public static void LoadIntertitialAlienView(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {
    }

    public static void LoadIntertitialAlienMediation(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {

    }

    public static void ShowIntertitialAlienView(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                                int interval) {
    }

    public static void ShowIntertitialAlienMediation(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                                     int interval) {
    }

    public static void LoadIntertitialWortise(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {

    }

    public static void ShowIntertitialWortise(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                              int interval) {

    }
}

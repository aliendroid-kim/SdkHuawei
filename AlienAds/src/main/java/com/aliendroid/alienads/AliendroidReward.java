package com.aliendroid.alienads;

import static android.content.ContentValues.TAG;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;

import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.HwAds;
import com.huawei.hms.ads.reward.Reward;
import com.huawei.hms.ads.reward.RewardAd;
import com.huawei.hms.ads.reward.RewardAdLoadListener;
import com.huawei.hms.ads.reward.RewardAdStatusListener;


public class AliendroidReward {
    public static boolean unlockreward = false;
    public static RewardAd rewardedAd;

    public static void LoadRewardAdmob(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {

        HwAds.init(activity);
        if (rewardedAd == null) {
            rewardedAd = new RewardAd(activity,idReward);
        }

        RewardAdLoadListener rewardAdLoadListener = new RewardAdLoadListener() {
            @Override
            public void onRewardAdFailedToLoad(int errorCode) {

            }

            @Override
            public void onRewardedLoaded() {

            }
        };

        rewardedAd.loadAd(new AdParam.Builder().build(), rewardAdLoadListener);

    }

    public static void LoadRewardUnity(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {

    }

    public static void LoadRewardGoogleAds(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {

    }


    public static void LoadRewardApplovinMax(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {

    }

    public static void LoadRewardApplovinDis(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {

    }

    public static void LoadRewardMopub(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {

    }

    public static void LoadRewardIron(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {
    }

    public static void LoadRewardStartApp(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {

    }


    public static void ShowRewardAdmob(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {

        if (rewardedAd.isLoaded()) {
            rewardedAd.show(activity, new RewardAdStatusListener() {
                @Override
                public void onRewardAdClosed() {
                    LoadRewardAdmob(activity,selecBackuptAds, idReward,idBackupReward);
                }

                @Override
                public void onRewardAdFailedToShow(int errorCode) {

                }

                @Override
                public void onRewardAdOpened() {

                }

                @Override
                public void onRewarded(Reward reward) {
                    unlockreward = true;
                    LoadRewardAdmob(activity,selecBackuptAds, idReward,idBackupReward);
                }
            });
        }
    }

    public static void ShowRewardGoogleAds(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {

    }

    public static void ShowRewardApplovinMax(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {
    }

    public static void ShowRewardApplovinDis(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {
    }

    public static void ShowRewardMopub(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {

    }

    public static void ShowRewardIron(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {

    }

    public static void ShowRewardUnity(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {

    }

    public static void ShowRewardStartApp(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {


    }
    public static void LoadRewardAlienView(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {
    }

    public static void ShowRewardAlienView(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {
    }

    public static void LoadRewardFan(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {
    }
    public static void LoadRewardAlienMediation(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {
    }
    public static void ShowRewardAlienMediation(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {
        LoadRewardAlienMediation(activity, selecBackuptAds, idReward, idBackupReward);
    }
    public static void ShowRewardWortise(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {

    }
    public static void LoadRewardWortise(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {

    }
}

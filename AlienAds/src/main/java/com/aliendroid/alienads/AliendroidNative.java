package com.aliendroid.alienads;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.huawei.hms.ads.AdListener;
import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.VideoConfiguration;
import com.huawei.hms.ads.nativead.DislikeAdListener;
import com.huawei.hms.ads.nativead.NativeAd;
import com.huawei.hms.ads.nativead.NativeAdConfiguration;
import com.huawei.hms.ads.nativead.NativeAdLoader;

import java.util.ArrayList;
import java.util.List;


public class AliendroidNative {
   public static NativeAd globalNativeAd;

    public static void SmallNativeAdmob(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup, String Hpk1,
                                        String Hpk2, String Hpk3, String Hpk4, String Hpk5) {


        NativeAdLoader.Builder builder = new NativeAdLoader.Builder(activity, nativeId);
        builder.setNativeAdLoadedListener(new NativeAd.NativeAdLoadedListener() {
            @Override
            public void onNativeAdLoaded(NativeAd nativeAd) {
                if (null != globalNativeAd) {
                    globalNativeAd.destroy();
                }
                globalNativeAd = nativeAd;

                final View nativeView = NativeViewFactory.createSmallImageAdView(nativeAd, layNative);
                if (nativeView != null) {
                    globalNativeAd.setDislikeAdListener(new DislikeAdListener() {
                        @Override
                        public void onAdDisliked() {
                            layNative.removeView(nativeView);
                        }
                    });
                    layNative.removeAllViews();
                    layNative.addView(nativeView);
                }
            }
        }).setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {

            }

            @Override
            public void onAdFailed(int errorCode) {

            }
        });

        VideoConfiguration videoConfiguration = new VideoConfiguration.Builder()
                .setStartMuted(true)
                .build();

        NativeAdConfiguration adConfiguration = new NativeAdConfiguration.Builder()
                .setChoicesPosition(NativeAdConfiguration.ChoicesPosition.BOTTOM_RIGHT) // Set custom attributes.
                .setVideoConfiguration(videoConfiguration)
                .setRequestMultiImages(true)
                .build();

        NativeAdLoader nativeAdLoader = builder.setNativeAdOptions(adConfiguration).build();
        nativeAdLoader.loadAd(new AdParam.Builder().build());



    }
    public static void SmallNativeAdmobRectangle(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup, String Hpk1,
                                        String Hpk2, String Hpk3, String Hpk4, String Hpk5) {

        NativeAdLoader.Builder builder = new NativeAdLoader.Builder(activity, nativeId);
        builder.setNativeAdLoadedListener(new NativeAd.NativeAdLoadedListener() {
            @Override
            public void onNativeAdLoaded(NativeAd nativeAd) {
                if (null != globalNativeAd) {
                    globalNativeAd.destroy();
                }
                globalNativeAd = nativeAd;

                final View nativeView = NativeViewFactory.createMediumAdView(nativeAd, layNative);
                if (nativeView != null) {
                    globalNativeAd.setDislikeAdListener(new DislikeAdListener() {
                        @Override
                        public void onAdDisliked() {
                            layNative.removeView(nativeView);
                        }
                    });
                    layNative.removeAllViews();
                    layNative.addView(nativeView);
                }
            }
        }).setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {

            }

            @Override
            public void onAdFailed(int errorCode) {

            }
        });

        VideoConfiguration videoConfiguration = new VideoConfiguration.Builder()
                .setStartMuted(true)
                .build();

        NativeAdConfiguration adConfiguration = new NativeAdConfiguration.Builder()
                .setChoicesPosition(NativeAdConfiguration.ChoicesPosition.BOTTOM_RIGHT) // Set custom attributes.
                .setVideoConfiguration(videoConfiguration)
                .setRequestMultiImages(true)
                .build();

        NativeAdLoader nativeAdLoader = builder.setNativeAdOptions(adConfiguration).build();
        nativeAdLoader.loadAd(new AdParam.Builder().build());

    }
    public static void SmallNativeAdmobWhite(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup, String Hpk1,
                                             String Hpk2, String Hpk3, String Hpk4, String Hpk5) {
        NativeAdLoader.Builder builder = new NativeAdLoader.Builder(activity, nativeId);
        builder.setNativeAdLoadedListener(new NativeAd.NativeAdLoadedListener() {
            @Override
            public void onNativeAdLoaded(NativeAd nativeAd) {
                if (null != globalNativeAd) {
                    globalNativeAd.destroy();
                }
                globalNativeAd = nativeAd;

                final View nativeView = NativeViewFactory.createSmallImageAdView(nativeAd, layNative);
                if (nativeView != null) {
                    globalNativeAd.setDislikeAdListener(new DislikeAdListener() {
                        @Override
                        public void onAdDisliked() {
                            layNative.removeView(nativeView);
                        }
                    });
                    layNative.removeAllViews();
                    layNative.addView(nativeView);
                }
            }
        }).setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {

            }

            @Override
            public void onAdFailed(int errorCode) {

            }
        });

        VideoConfiguration videoConfiguration = new VideoConfiguration.Builder()
                .setStartMuted(true)
                .build();

        NativeAdConfiguration adConfiguration = new NativeAdConfiguration.Builder()
                .setChoicesPosition(NativeAdConfiguration.ChoicesPosition.BOTTOM_RIGHT) // Set custom attributes.
                .setVideoConfiguration(videoConfiguration)
                .setRequestMultiImages(true)
                .build();

        NativeAdLoader nativeAdLoader = builder.setNativeAdOptions(adConfiguration).build();
        nativeAdLoader.loadAd(new AdParam.Builder().build());

    }

    public static void SmallNativeAdmobNonStroke(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup, String Hpk1,
                                                 String Hpk2, String Hpk3, String Hpk4, String Hpk5) {

        NativeAdLoader.Builder builder = new NativeAdLoader.Builder(activity, nativeId);
        builder.setNativeAdLoadedListener(new NativeAd.NativeAdLoadedListener() {
            @Override
            public void onNativeAdLoaded(NativeAd nativeAd) {
                if (null != globalNativeAd) {
                    globalNativeAd.destroy();
                }
                globalNativeAd = nativeAd;

                final View nativeView = NativeViewFactory.createSmallImageAdView(nativeAd, layNative);
                if (nativeView != null) {
                    globalNativeAd.setDislikeAdListener(new DislikeAdListener() {
                        @Override
                        public void onAdDisliked() {
                            layNative.removeView(nativeView);
                        }
                    });
                    layNative.removeAllViews();
                    layNative.addView(nativeView);
                }
            }
        }).setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {

            }

            @Override
            public void onAdFailed(int errorCode) {

            }
        });

        VideoConfiguration videoConfiguration = new VideoConfiguration.Builder()
                .setStartMuted(true)
                .build();

        NativeAdConfiguration adConfiguration = new NativeAdConfiguration.Builder()
                .setChoicesPosition(NativeAdConfiguration.ChoicesPosition.BOTTOM_RIGHT) // Set custom attributes.
                .setVideoConfiguration(videoConfiguration)
                .setRequestMultiImages(true)
                .build();

        NativeAdLoader nativeAdLoader = builder.setNativeAdOptions(adConfiguration).build();
        nativeAdLoader.loadAd(new AdParam.Builder().build());

    }

    public static void SmallNativeGoogleAds(Activity activity, String selectAds, String selectAdsBackup, FrameLayout layNative, String nativeId, String idBannerBackup) {


    }

    public static void MediumNative(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup, String Hpk1,
                                    String Hpk2, String Hpk3, String Hpk4, String Hpk5) {
        NativeAdLoader.Builder builder = new NativeAdLoader.Builder(activity, nativeId);
        builder.setNativeAdLoadedListener(new NativeAd.NativeAdLoadedListener() {
            @Override
            public void onNativeAdLoaded(NativeAd nativeAd) {
                if (null != globalNativeAd) {
                    globalNativeAd.destroy();
                }
                globalNativeAd = nativeAd;

                final View nativeView = NativeViewFactory.createMediumAdView(nativeAd, layNative);
                if (nativeView != null) {
                    globalNativeAd.setDislikeAdListener(new DislikeAdListener() {
                        @Override
                        public void onAdDisliked() {
                            layNative.removeView(nativeView);
                        }
                    });
                    layNative.removeAllViews();
                    layNative.addView(nativeView);
                }
            }
        }).setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {

            }

            @Override
            public void onAdFailed(int errorCode) {

            }
        });

        VideoConfiguration videoConfiguration = new VideoConfiguration.Builder()
                .setStartMuted(true)
                .build();

        NativeAdConfiguration adConfiguration = new NativeAdConfiguration.Builder()
                .setChoicesPosition(NativeAdConfiguration.ChoicesPosition.BOTTOM_RIGHT) // Set custom attributes.
                .setVideoConfiguration(videoConfiguration)
                .setRequestMultiImages(true)
                .build();

        NativeAdLoader nativeAdLoader = builder.setNativeAdOptions(adConfiguration).build();
        nativeAdLoader.loadAd(new AdParam.Builder().build());

    }

    public static void MediumNativeNonStroke(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup, String Hpk1,
                                             String Hpk2, String Hpk3, String Hpk4, String Hpk5) {
        NativeAdLoader.Builder builder = new NativeAdLoader.Builder(activity, nativeId);
        builder.setNativeAdLoadedListener(new NativeAd.NativeAdLoadedListener() {
            @Override
            public void onNativeAdLoaded(NativeAd nativeAd) {
                if (null != globalNativeAd) {
                    globalNativeAd.destroy();
                }
                globalNativeAd = nativeAd;

                final View nativeView = NativeViewFactory.createMediumAdView(nativeAd, layNative);
                if (nativeView != null) {
                    globalNativeAd.setDislikeAdListener(new DislikeAdListener() {
                        @Override
                        public void onAdDisliked() {
                            layNative.removeView(nativeView);
                        }
                    });
                    layNative.removeAllViews();
                    layNative.addView(nativeView);
                }
            }
        }).setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {

            }

            @Override
            public void onAdFailed(int errorCode) {

            }
        });

        VideoConfiguration videoConfiguration = new VideoConfiguration.Builder()
                .setStartMuted(true)
                .build();

        NativeAdConfiguration adConfiguration = new NativeAdConfiguration.Builder()
                .setChoicesPosition(NativeAdConfiguration.ChoicesPosition.BOTTOM_RIGHT) // Set custom attributes.
                .setVideoConfiguration(videoConfiguration)
                .setRequestMultiImages(true)
                .build();

        NativeAdLoader nativeAdLoader = builder.setNativeAdOptions(adConfiguration).build();
        nativeAdLoader.loadAd(new AdParam.Builder().build());

    }

    public static void MediumNativeWhite(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup, String Hpk1,
                                         String Hpk2, String Hpk3, String Hpk4, String Hpk5) {
        NativeAdLoader.Builder builder = new NativeAdLoader.Builder(activity, nativeId);
        builder.setNativeAdLoadedListener(new NativeAd.NativeAdLoadedListener() {
            @Override
            public void onNativeAdLoaded(NativeAd nativeAd) {
                if (null != globalNativeAd) {
                    globalNativeAd.destroy();
                }
                globalNativeAd = nativeAd;

                final View nativeView = NativeViewFactory.createMediumAdView(nativeAd, layNative);
                if (nativeView != null) {
                    globalNativeAd.setDislikeAdListener(new DislikeAdListener() {
                        @Override
                        public void onAdDisliked() {
                            layNative.removeView(nativeView);
                        }
                    });
                    layNative.removeAllViews();
                    layNative.addView(nativeView);
                }
            }
        }).setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {

            }

            @Override
            public void onAdFailed(int errorCode) {

            }
        });

        VideoConfiguration videoConfiguration = new VideoConfiguration.Builder()
                .setStartMuted(true)
                .build();

        NativeAdConfiguration adConfiguration = new NativeAdConfiguration.Builder()
                .setChoicesPosition(NativeAdConfiguration.ChoicesPosition.BOTTOM_RIGHT) // Set custom attributes.
                .setVideoConfiguration(videoConfiguration)
                .setRequestMultiImages(true)
                .build();

        NativeAdLoader nativeAdLoader = builder.setNativeAdOptions(adConfiguration).build();
        nativeAdLoader.loadAd(new AdParam.Builder().build());
    }

    public static void MediumNativeGoogleAds(Activity activity, String selectAds, String selectAdsBackup, FrameLayout layNative, String nativeId, String idBannerBackup
    ) {

    }

    public static void MediumNativeMaxNonStroke(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {
    }

    public static void MediumNativeMaxWhite(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {
    }

    public static void MediumNativeMax(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }
    public static void SmallNativeMaxNonStroke(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }
    public static void SmallNativeMaxWhite(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }
    public static void SmallNativeMax(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }
    public static void SmallNativeMaxRectangle(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }

    private void showNativeAd(NativeAd nativeAd) {
        // Destroy the original native ad.

    }

    public static void SmallNativeFan(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }

    public static void SmallNativeStartApp(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {
    }

    public static void MediumNativeStartApp(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }

    public static void MediumNativeAdmob(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup, String Hpk1,
                                         String Hpk2, String Hpk3, String Hpk4, String Hpk5) {

    }

    public static void MediumNativeFan(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }

    public static void MediumNativeAlien(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }
    public static void SmallNativeAlien(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {
    }

    public static void SmallNativeFanRectangle(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }

    public static void SmallNativeAlienRectangle(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {
    }

    //Rectangle
    public static void SmallNativeStartAppRectangle(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }
    public static void SmallNativeWortise(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup
    ) {

    }
    public static void MediumNativeWortise(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }

    public static void SmallNativeWortiseRectangle(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }
}

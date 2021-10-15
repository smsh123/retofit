package com.example.myapplication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Setting {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("email_from")
    @Expose
    private String emailFrom;
    @SerializedName("redeem_points")
    @Expose
    private String redeemPoints;
    @SerializedName("redeem_money")
    @Expose
    private String redeemMoney;
    @SerializedName("redeem_currency")
    @Expose
    private String redeemCurrency;
    @SerializedName("minimum_redeem_points")
    @Expose
    private String minimumRedeemPoints;
    @SerializedName("per_spin_charge")
    @Expose
    private String perSpinCharge;
    @SerializedName("spin_charge")
    @Expose
    private String spinCharge;
    @SerializedName("payment_gateway")
    @Expose
    private String paymentGateway;
    @SerializedName("minimum_add_money")
    @Expose
    private String minimumAddMoney;
    @SerializedName("paytm_mid")
    @Expose
    private String paytmMid;
    @SerializedName("paytm_key")
    @Expose
    private String paytmKey;
    @SerializedName("upi_payment")
    @Expose
    private String upiPayment;
    @SerializedName("upi_id")
    @Expose
    private String upiId;
    @SerializedName("razorpay_mid")
    @Expose
    private String razorpayMid;
    @SerializedName("razorpay_key")
    @Expose
    private String razorpayKey;
    @SerializedName("payumoney_mid")
    @Expose
    private String payumoneyMid;
    @SerializedName("payumoney_key")
    @Expose
    private String payumoneyKey;
    @SerializedName("app_name")
    @Expose
    private String appName;
    @SerializedName("app_logo")
    @Expose
    private String appLogo;
    @SerializedName("app_email")
    @Expose
    private String appEmail;
    @SerializedName("app_version")
    @Expose
    private String appVersion;
    @SerializedName("app_author")
    @Expose
    private String appAuthor;
    @SerializedName("app_contact")
    @Expose
    private String appContact;
    @SerializedName("app_website")
    @Expose
    private String appWebsite;
    @SerializedName("app_description")
    @Expose
    private String appDescription;
    @SerializedName("app_developed_by")
    @Expose
    private String appDevelopedBy;
    @SerializedName("app_privacy_policy")
    @Expose
    private String appPrivacyPolicy;
    @SerializedName("add_type")
    @Expose
    private String addType;
    @SerializedName("publisher_id")
    @Expose
    private String publisherId;
    @SerializedName("registration_reward")
    @Expose
    private String registrationReward;
    @SerializedName("app_refer_reward")
    @Expose
    private String appReferReward;
    @SerializedName("video_add_point")
    @Expose
    private String videoAddPoint;
    @SerializedName("banner_ad")
    @Expose
    private String bannerAd;
    @SerializedName("banner_ad_id")
    @Expose
    private String bannerAdId;
    @SerializedName("fb_banner_ad_id")
    @Expose
    private String fbBannerAdId;
    @SerializedName("interstital_ad")
    @Expose
    private String interstitalAd;
    @SerializedName("interstital_ad_click")
    @Expose
    private String interstitalAdClick;
    @SerializedName("interstital_ad_id")
    @Expose
    private String interstitalAdId;
    @SerializedName("fb_interstital_ad_id")
    @Expose
    private String fbInterstitalAdId;
    @SerializedName("rewarded_video_ads")
    @Expose
    private String rewardedVideoAds;
    @SerializedName("rewarded_video_ads_id")
    @Expose
    private String rewardedVideoAdsId;
    @SerializedName("fb_rewarded_add_id")
    @Expose
    private String fbRewardedAddId;
    @SerializedName("daily_rewarded_video_ads_limits")
    @Expose
    private String dailyRewardedVideoAdsLimits;
    @SerializedName("app_faq")
    @Expose
    private String appFaq;
    @SerializedName("payment_method1")
    @Expose
    private String paymentMethod1;
    @SerializedName("payment_method2")
    @Expose
    private String paymentMethod2;
    @SerializedName("payment_method3")
    @Expose
    private String paymentMethod3;
    @SerializedName("payment_method4")
    @Expose
    private String paymentMethod4;
    @SerializedName("daily_spin_limit")
    @Expose
    private String dailySpinLimit;
    @SerializedName("ads_frequency_limit")
    @Expose
    private String adsFrequencyLimit;
    @SerializedName("onesignalapp_id")
    @Expose
    private String onesignalappId;
    @SerializedName("onesignalapp_key")
    @Expose
    private String onesignalappKey;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmailFrom() {
        return emailFrom;
    }

    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }

    public String getRedeemPoints() {
        return redeemPoints;
    }

    public void setRedeemPoints(String redeemPoints) {
        this.redeemPoints = redeemPoints;
    }

    public String getRedeemMoney() {
        return redeemMoney;
    }

    public void setRedeemMoney(String redeemMoney) {
        this.redeemMoney = redeemMoney;
    }

    public String getRedeemCurrency() {
        return redeemCurrency;
    }

    public void setRedeemCurrency(String redeemCurrency) {
        this.redeemCurrency = redeemCurrency;
    }

    public String getMinimumRedeemPoints() {
        return minimumRedeemPoints;
    }

    public void setMinimumRedeemPoints(String minimumRedeemPoints) {
        this.minimumRedeemPoints = minimumRedeemPoints;
    }

    public String getPerSpinCharge() {
        return perSpinCharge;
    }

    public void setPerSpinCharge(String perSpinCharge) {
        this.perSpinCharge = perSpinCharge;
    }

    public String getSpinCharge() {
        return spinCharge;
    }

    public void setSpinCharge(String spinCharge) {
        this.spinCharge = spinCharge;
    }

    public String getPaymentGateway() {
        return paymentGateway;
    }

    public void setPaymentGateway(String paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public String getMinimumAddMoney() {
        return minimumAddMoney;
    }

    public void setMinimumAddMoney(String minimumAddMoney) {
        this.minimumAddMoney = minimumAddMoney;
    }

    public String getPaytmMid() {
        return paytmMid;
    }

    public void setPaytmMid(String paytmMid) {
        this.paytmMid = paytmMid;
    }

    public String getPaytmKey() {
        return paytmKey;
    }

    public void setPaytmKey(String paytmKey) {
        this.paytmKey = paytmKey;
    }

    public String getUpiPayment() {
        return upiPayment;
    }

    public void setUpiPayment(String upiPayment) {
        this.upiPayment = upiPayment;
    }

    public String getUpiId() {
        return upiId;
    }

    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }

    public String getRazorpayMid() {
        return razorpayMid;
    }

    public void setRazorpayMid(String razorpayMid) {
        this.razorpayMid = razorpayMid;
    }

    public String getRazorpayKey() {
        return razorpayKey;
    }

    public void setRazorpayKey(String razorpayKey) {
        this.razorpayKey = razorpayKey;
    }

    public String getPayumoneyMid() {
        return payumoneyMid;
    }

    public void setPayumoneyMid(String payumoneyMid) {
        this.payumoneyMid = payumoneyMid;
    }

    public String getPayumoneyKey() {
        return payumoneyKey;
    }

    public void setPayumoneyKey(String payumoneyKey) {
        this.payumoneyKey = payumoneyKey;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppLogo() {
        return appLogo;
    }

    public void setAppLogo(String appLogo) {
        this.appLogo = appLogo;
    }

    public String getAppEmail() {
        return appEmail;
    }

    public void setAppEmail(String appEmail) {
        this.appEmail = appEmail;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getAppAuthor() {
        return appAuthor;
    }

    public void setAppAuthor(String appAuthor) {
        this.appAuthor = appAuthor;
    }

    public String getAppContact() {
        return appContact;
    }

    public void setAppContact(String appContact) {
        this.appContact = appContact;
    }

    public String getAppWebsite() {
        return appWebsite;
    }

    public void setAppWebsite(String appWebsite) {
        this.appWebsite = appWebsite;
    }

    public String getAppDescription() {
        return appDescription;
    }

    public void setAppDescription(String appDescription) {
        this.appDescription = appDescription;
    }

    public String getAppDevelopedBy() {
        return appDevelopedBy;
    }

    public void setAppDevelopedBy(String appDevelopedBy) {
        this.appDevelopedBy = appDevelopedBy;
    }

    public String getAppPrivacyPolicy() {
        return appPrivacyPolicy;
    }

    public void setAppPrivacyPolicy(String appPrivacyPolicy) {
        this.appPrivacyPolicy = appPrivacyPolicy;
    }

    public String getAddType() {
        return addType;
    }

    public void setAddType(String addType) {
        this.addType = addType;
    }

    public String getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }

    public String getRegistrationReward() {
        return registrationReward;
    }

    public void setRegistrationReward(String registrationReward) {
        this.registrationReward = registrationReward;
    }

    public String getAppReferReward() {
        return appReferReward;
    }

    public void setAppReferReward(String appReferReward) {
        this.appReferReward = appReferReward;
    }

    public String getVideoAddPoint() {
        return videoAddPoint;
    }

    public void setVideoAddPoint(String videoAddPoint) {
        this.videoAddPoint = videoAddPoint;
    }

    public String getBannerAd() {
        return bannerAd;
    }

    public void setBannerAd(String bannerAd) {
        this.bannerAd = bannerAd;
    }

    public String getBannerAdId() {
        return bannerAdId;
    }

    public void setBannerAdId(String bannerAdId) {
        this.bannerAdId = bannerAdId;
    }

    public String getFbBannerAdId() {
        return fbBannerAdId;
    }

    public void setFbBannerAdId(String fbBannerAdId) {
        this.fbBannerAdId = fbBannerAdId;
    }

    public String getInterstitalAd() {
        return interstitalAd;
    }

    public void setInterstitalAd(String interstitalAd) {
        this.interstitalAd = interstitalAd;
    }

    public String getInterstitalAdClick() {
        return interstitalAdClick;
    }

    public void setInterstitalAdClick(String interstitalAdClick) {
        this.interstitalAdClick = interstitalAdClick;
    }

    public String getInterstitalAdId() {
        return interstitalAdId;
    }

    public void setInterstitalAdId(String interstitalAdId) {
        this.interstitalAdId = interstitalAdId;
    }

    public String getFbInterstitalAdId() {
        return fbInterstitalAdId;
    }

    public void setFbInterstitalAdId(String fbInterstitalAdId) {
        this.fbInterstitalAdId = fbInterstitalAdId;
    }

    public String getRewardedVideoAds() {
        return rewardedVideoAds;
    }

    public void setRewardedVideoAds(String rewardedVideoAds) {
        this.rewardedVideoAds = rewardedVideoAds;
    }

    public String getRewardedVideoAdsId() {
        return rewardedVideoAdsId;
    }

    public void setRewardedVideoAdsId(String rewardedVideoAdsId) {
        this.rewardedVideoAdsId = rewardedVideoAdsId;
    }

    public String getFbRewardedAddId() {
        return fbRewardedAddId;
    }

    public void setFbRewardedAddId(String fbRewardedAddId) {
        this.fbRewardedAddId = fbRewardedAddId;
    }

    public String getDailyRewardedVideoAdsLimits() {
        return dailyRewardedVideoAdsLimits;
    }

    public void setDailyRewardedVideoAdsLimits(String dailyRewardedVideoAdsLimits) {
        this.dailyRewardedVideoAdsLimits = dailyRewardedVideoAdsLimits;
    }

    public String getAppFaq() {
        return appFaq;
    }

    public void setAppFaq(String appFaq) {
        this.appFaq = appFaq;
    }

    public String getPaymentMethod1() {
        return paymentMethod1;
    }

    public void setPaymentMethod1(String paymentMethod1) {
        this.paymentMethod1 = paymentMethod1;
    }

    public String getPaymentMethod2() {
        return paymentMethod2;
    }

    public void setPaymentMethod2(String paymentMethod2) {
        this.paymentMethod2 = paymentMethod2;
    }

    public String getPaymentMethod3() {
        return paymentMethod3;
    }

    public void setPaymentMethod3(String paymentMethod3) {
        this.paymentMethod3 = paymentMethod3;
    }

    public String getPaymentMethod4() {
        return paymentMethod4;
    }

    public void setPaymentMethod4(String paymentMethod4) {
        this.paymentMethod4 = paymentMethod4;
    }

    public String getDailySpinLimit() {
        return dailySpinLimit;
    }

    public void setDailySpinLimit(String dailySpinLimit) {
        this.dailySpinLimit = dailySpinLimit;
    }

    public String getAdsFrequencyLimit() {
        return adsFrequencyLimit;
    }

    public void setAdsFrequencyLimit(String adsFrequencyLimit) {
        this.adsFrequencyLimit = adsFrequencyLimit;
    }

    public String getOnesignalappId() {
        return onesignalappId;
    }

    public void setOnesignalappId(String onesignalappId) {
        this.onesignalappId = onesignalappId;
    }

    public String getOnesignalappKey() {
        return onesignalappKey;
    }

    public void setOnesignalappKey(String onesignalappKey) {
        this.onesignalappKey = onesignalappKey;
    }

}
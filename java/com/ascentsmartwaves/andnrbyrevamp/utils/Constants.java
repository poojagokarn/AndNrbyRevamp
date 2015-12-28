package com.ascentsmartwaves.andnrbyrevamp.utils;

import android.content.SharedPreferences;
import android.util.Log;

/*import com.ascentsmartwaves.andnrby.R;
import com.ascentsmartwaves.andnrby.async.SendUserActionsAsyncTask;
import com.ascentsmartwaves.andnrby.data.AllBrandsData;
import com.ascentsmartwaves.andnrby.data.AnbysData;
import com.ascentsmartwaves.andnrby.data.AndNrbyFragmentDetailData;
import com.ascentsmartwaves.andnrby.data.BrandPageData;
import com.ascentsmartwaves.andnrby.data.BrandPageDetailsData;
import com.ascentsmartwaves.andnrby.data.CatalogueData;
import com.ascentsmartwaves.andnrby.data.DealsData;
import com.ascentsmartwaves.andnrby.data.DealsWalletData;
import com.ascentsmartwaves.andnrby.data.BookmarksData;
import com.ascentsmartwaves.andnrby.data.FavouritesAnbysData;
import com.ascentsmartwaves.andnrby.data.FavouritesData;
import com.ascentsmartwaves.andnrby.data.MyBrandsCheckData;
import com.ascentsmartwaves.andnrby.data.MyBrandsData;
import com.ascentsmartwaves.andnrby.data.NotificationData;
import com.ascentsmartwaves.andnrby.data.OtherProductsData;
import com.ascentsmartwaves.andnrby.data.SearchData;
import com.ascentsmartwaves.andnrby.data.TransactionData;
import com.ascentsmartwaves.andnrby.data.UserProfileData;
import com.ascentsmartwaves.andnrby.database.DatabaseHelper;
import com.google.android.gms.common.api.GoogleApiClient;*/

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by ADMIN on 05-background_landing_fragment-2014.
 */
public class Constants{

    // Log Tags for all the classes
    public static final String LOG_TAG = "AndNrby";
    public static final String SplashScreenActivity = " SPLASH SCREEN ACTIVITY ";
    public static final String SettingsActivity = " SETTINGS ACTIVITY ";
    public static final String TermsAndConditionActivity = " TERMS AND CONDITION ACTIVITY ";
    public static final String RegisterLoginActivity = " REGISTER LOGIN ACTIVITY ";
    public static final String ProfileActivity = " PROFILE ACTIVITY ";
    public static final String PrivacyActivity = " PRIVACY ACTIVITY ";
    public static final String MyBrandsActivity = " MY BRANDS ACTIVITY ";
    public static final String LandingActivity = " LANDING ACTIVITY ";
    public static final String FlagDealActivity = " FLAG DEAL ACTIVITY ";
    public static final String FAVOURITES_FRAGMENT_DETAIL_ACTIVITY = " FAVOURITES FRAGMENT DETAIL ACTIVITY ";
    public static final String DealsWalletActivity = " DEALS WALLET ACTIVITY ";
    public static final String BRAND_PAGE_ACTIVITY = " BRAND_PAGE ACTIVITY ";
    public static final String BookmarksActivity = " BOOKMARKS ACTIVITY ";
    public static final String AndNrbyFragmentDetailActivity = " ANDNRBY FRAGMENT DETAIL ACTIVITY ";
    public static final String AboutUsActivity = " ABOUT US ACTIVITY ";
    public static final String FetchUserHistoryActivity = " FETCH USER HISTORY ACTIVITY ";
    public static final String SearchActivityResult = " SEARCH_ACTIVITY_RESULT ";

    // LOG TAGS  for adapters
    public static final String ANDNRBY_RECYCLER_ADAPTER = " ANDNRBY RECYCLER ADAPTER ";
    public static final String BOOKMARKS_RECYCLER_ADAPTER = " BOOKMARKS RECYCLER ADAPTER ";
    public static final String BRAND_PAGE_RECYCLER_ADAPTER = " BRAND PAGE RECYCLER ADAPTER ";
    public static final String DEALS_WALLET_RECYCLER_ADAPTER = " DEALS WALLET RECYCLER ADAPTER ";
    public static final String FAVOURITES_RECYCLER_ADAPTER = " FAVOURITES RECYCLER ADAPTER ";
    public static final String MY_BRANDS_RECYCLER_ADAPTER = " MY BRANDS RECYCLER ADAPTER ";
    public static final String LANDING_PAGE_FRAGMENTS_ADAPTER = " LANDING PAGE FRAGMENTS ADAPTER ";

    //LOG TAGS FOR ASYNC TASKS
    public static final String ConvertingDataToJsonObjectAsyncTask = " CONVERTING_DATA_TO_JSON_OBJECT_ASYNC_TASK ";
    public static final String DeleteDealAsyncTask = " DELETE_DEAL_ASYNC_TASK ";
    public static final String DownloadImageForNotificationAsyncTask = " DOWNLOAD_IMAGE_FOR_NOTIFICATION_ASYNC_TASK ";
    public static final String FetchAllBrandsAsyncTask = " FETCH_ALL_BRANDS_ASYNC_TASK ";
    public static final String FetchBrandPageAsyncTask = " FETCH_BRAND_PAGE_ASYNC_TASK ";
    public static final String FetchDealDetailsAsyncTask = " FETCH DEAL DETAILS ASYNC TASK ";
    public static final String FetchDealsAsyncTask = " FETCH DEALS ASYNC TASK ";
    public static final String FetchDealsHistoryAsyncTask = " FETCH DEALS HISTORY ASYNC TASK ";
    public static final String FetchFavouritesAsyncTask = " FETCH FAVOURITES ASYNC TASK ";
    public static final String FetchMerchantDetailsAsyncTask = " FETCH MERCHANT DETAILS ASYNC TASK ";
    public static final String FetchMyBrandsAsyncTask = " FETCH MY BRANDS ASYNC TASK ";
    public static final String FetchNewLikesAndRedeems = " FETCH NEW LIKES AND REDEEMS ";
    public static final String FetchSearchedBrandAsynctask = " FETCH_SEARCHED_BRAND_ASYNC_TASK ";
    public static final String FetchValidDealsAsyncTask = " FETCH VALID DEALS ASYNC TASK ";
    public static final String FetchValidDealsHistoryAsyncTask = " FETCH VALID DEALS HISTORY ASYNC TASK ";
    public static final String FetchValidFavouritesDealsAsyncTask = " FETCH VALID DEALS ASYNC TASK ";
    public static final String FlagDealAsyncTask = " FLAG DEAL ASYNC TASK ";
    public static final String GetDealsAsyncTask = " GET DEALS ASYNC TASK ";
    public static final String GetDistanceAsyncTask = " GET DISTANCE ASYNC TASK ";
    public static final String LoadMapAsyncTask = " LOAD MAP ASYNC TASK ";
    public static final String LoginAsyncTask = " LOGIN ASYNC TASK ";
    public static final String ReferralAsyncTask = " REFERRAL ASYNC TASK ";
    public static final String RegisterAppAsyncTask = " REGISTER APP ASYNC TASK ";
    public static final String RegisterUserAsyncTask = " REGISTER USER ASYNC TASK ";
    public static final String RegisterWithGCMAsyncTask = " REGISTER WITH GCM ASYNC TASK ";
    public static final String SendUserActionsAsyncTask = " SEND USER ACTIONS ASYNC TASK ";
    public static final String UpdateUserActionsInDatabaseAsyncTask = " UPDATE USER ACTIONS IN DATABASE ASYNC TASK ";
    public static final String UpdateUserProfileAsyncTask = " UPDATE USER PROFILE ASYNC TASK ";
    public static final String UploadProfileImageAsyncTask = " UPLOAD PROFILE IMAGE ASYNC TASK ";
    public static final String UserProfileAsyncTask = " USER PROFILE ASYNC TASK ";
    public static final String FetchProductsToBeDisplayed = " FETCH PRODUCTS TO BE DISPLAYED ";


    public static final String DELETE_USER_ACTIONS_ASYNC_TASK = " DELETE USER ACTIONS ASYNC TASK ";


//    public static final String shareTheAppMessage = "Always get Smart Localized Deals and Offers only on AndNrby. Install AndNrby and start saving!";
    public static final String shareTheAppMessage = "Get Smart Localized Deals & Offers only on AndNrby. Install AndNrby and start saving! \n" +
        "https://goo.gl/MFTAKs \nEnter Referral ID: ";

    // LOG TAGS for Fragments
    public static final String ANBYS_FRAGMENT = "ANBYS FRAGMENT";
    public static final String FAVOURITES_FRAGMENT = "FAVOURITES FRAGMENT";
    public static final String MAP_FRAGMENT = "MAP FRAGMENT";

    


    //public static GoogleApiClient mGoogleApiClient;
    public static boolean mSignInClicked;
    public static SharedPreferences.Editor editor;
    public static boolean isRegistered = false;

    //Constants
    public static String registrationError = "null";
    public static String loginError = "null" ;
    public static String UserphotoURL  ;
    public static String profileUpdateStatus  ;
    public static String userId="null";
    public static int merchantId;
    public static String GCMRegID;
    public static String userHistoryStatus="null";
    public static String EndDate;
    public static String DealDescription;
    public static String likecounter;
    public static String redeemcounter;
    public static String userReferralStatus;
    public static String referralMessage;
    public static int newLikesValue;
    public static int dealId;
    //public static DatabaseHelper db;
    public static int distanceBetweenUserAndDeal =0;
    public static double currentLat ;
    public static double currentLong;
    public static double myLongitude;
    public static double myLatitude;
    public static boolean liked = false;
    public static boolean followed = false;
    public static boolean redeemed =false;
    public static String contactNumber;


    //JSON object
    public static JSONObject jsonObjectForUserAction,jsonObjectForValidDealId,jsonObjectForValidMerchantId,jsonObjectForNewLikesAndRedeems;

    //JSON array
    public static JSONArray jsonArrayForUserAction,jsonArrayForValidDealId,jsonArrayForValidMerchantId,jsonArrayForNewLikesAndRedeems;

    // Nested JSON object
    public static JSONObject nestedJsonObjectForUserAction,nestedJsonObjectForValidDealId,nestedJsonObjectForValidMerchantId,nestedJsonObjectForNewLikesAndRedeems;


    // ArrayList Data
    /*public static ArrayList<BrandPageData> brandPageData;
    public static ArrayList<OtherProductsData> otherProductsData;
    public static ArrayList<DealsWalletData> dealsWalletData;
    public static ArrayList<BookmarksData> bookmarksData;
    public static ArrayList<MyBrandsData> myBrandsData;
    public static ArrayList<AllBrandsData> allBrandsData;
    public static ArrayList<FavouritesData> favouritesData;
    public static ArrayList<AnbysData> anbysData;
    public static ArrayList<FavouritesAnbysData> favouritesAnbysData;
    public static ArrayList<DealsData> dealsData;
    public static ArrayList<UserProfileData> userProfileData;
    public static ArrayList<TransactionData> transactionData;
    public static ArrayList<AndNrbyFragmentDetailData> andnrbyFragmentDetail;
    public static ArrayList<BrandPageDetailsData> brandPageDetailsData;
    public static ArrayList<MyBrandsCheckData> myBrandsCheckData;
    public static ArrayList<SearchData> searchData;
    public static ArrayList<NotificationData> notificationData;
    public static ArrayList<CatalogueData> catalogueData;*/


    // fetch links for JSON test
//    public static String sendJsonDataURL = "http://www.andnrby.com/integration/apps/v1.0/andnrby/test/dealsShow.php?userID=";
//    public static String privacyPolicyURL = "http://andealr.com/PrivacyPolicy.html";
//    public static String termsAndConditionsURL = "http://andealr.com/Terms%20And%20Conditions.html";
//    public static String fetchUserProfileURL = "http://www.andnrby.com/integration/apps/v1.0/andnrby/test/userProfile.php?userID=";
//    public static String updateUserProfileURL = "http://www.andnrby.com/integration/apps/v1.0/andnrby/test/updateUser.php?userID=";
//    public static String FILE_UPLOAD_URL_USERPROFILE = "http://www.andnrby.com/integration/apps/v1.0/andnrby/test/userImage.php?userID=";
//    public static String googleRegisterURL ="http://www.andnrby.com/integration/apps/v1.0/andnrby/test/userRegistrationGoogle.php?firstName=";
//    public static String facebookRegisterURL ="http://www.andnrby.com/integration/apps/v1.0/andnrby/test/userRegistrationFacebook.php?emailID=";
//    public static String dealFlagURL = "http://www.andnrby.com/integration/apps/v1.0/andnrby/test/dealFlag.php?userID=";
//    public static String sendUserActionURL = "http://www.andnrby.com/integration/apps/v1.0/andnrby/test/json_transaction.php?userID=";
//    public static String fetchDealDetails = "http://www.andnrby.com/integration/apps/v1.0/andnrby/test/dealDetails.php?userID=";
//    public static String fetchFavouritesURL = "http://www.andnrby.com/integration/apps/v1.0/andnrby/test/userfavourite.php?userID=";
//    public static String fetchMyBrandsURL = "http://www.andnrby.com/integration/apps/v1.0/andnrby/test/mybrands.php?userID=";
//    public static String fetchBrandPage = "http://www.andnrby.com/integration/apps/v1.0/andnrby/test/merchantDeals.php?merchantID=";
//    public static String fetchNewLikesAndRedeems = "http://www.andnrby.com/integration/apps/v1.0/andnrby/test/refreshDeals.php?userID=";
//    public static String fetchDealGCMURL = "http://www.andnrby.com/integration/apps/v1.0/andnrby/test/dealGCM.php?userID=";
//    public static String deleteDealGCMURL = "http://www.andnrby.com/integration/apps/v1.0/andnrby/test/json_dealsended.php?userID=";
//    public static String referralURL = "http://www.andnrby.com/integration/apps/v1.0/andnrby/test/userReferral.php?userID=";
//    public static String fetchMerchantDetails = "http://www.andnrby.com/integration/apps/v1.0/andnrby/test/merchantDetails.php?merchantID=";
//    public static String sendFavouriteJsonData = "http://www.andnrby.com/integration/apps/v1.0/andnrby/test/favouriteDeals.php";
//    public static String fetchFollowedData = "http://www.andnrby.com/integration/apps/v1.0/andnrby/test/brandDeals.php?merchantID=";
//    public static String fetchAllBrandsURL = "http://www.andnrby.com/integration/apps/v1.0/andnrby/test/allBrands.php";
//    public static String fetchLikedAndRedeemedDeals = "http://www.andnrby.com/integration/apps/v1.0/andnrby/test/userActions.php?userID=";
//    public static String fetchActiveDealsURL = "http://www.andnrby.com/integration/apps/v1.0/andnrby/test/activeDeals.php?userID=";
//    public static String sendHistoryJsonDataURL = "http://www.andnrby.com/integration/apps/v1.0/andnrby/test/showActiveDeals.php?userID=";
//    public static String updateGcmId = "http://www.andnrby.com/integration/apps/v1.0/andnrby/test/gcmUpdate.php?userId=";
//    public static String searchStringURL = "http://www.andnrby.com/integration/apps/v1.0/andnrby/test/searchBrand.php?searchData=";


    // Production fetch Links FOR JSON
    public static String sendJsonDataURL = "http://www.andnrby.com/integration/apps/v1.0/andnrby/prod/dealsShow.php?userID=";
    public static String privacyPolicyURL = "http://andealr.com/PrivacyPolicy.html";
    public static String termsAndConditionsURL = "http://andealr.com/Terms%20And%20Conditions.html";
    public static String fetchUserProfileURL = "http://www.andnrby.com/integration/apps/v1.0/andnrby/prod/userProfile.php?userID=";
    public static String updateUserProfileURL = "http://www.andnrby.com/integration/apps/v1.0/andnrby/prod/updateUser.php?userID=";
    public static String FILE_UPLOAD_URL_USERPROFILE = "http://www.andnrby.com/integration/apps/v1.0/andnrby/prod/userImage.php?userID=";
    public static String googleRegisterURL ="http://www.andnrby.com/integration/apps/v1.0/andnrby/prod/userRegistrationGoogle.php?firstName=";
    public static String facebookRegisterURL ="http://www.andnrby.com/integration/apps/v1.0/andnrby/prod/userRegistrationFacebook.php?emailID=";
    public static String dealFlagURL = "http://www.andnrby.com/integration/apps/v1.0/andnrby/prod/dealFlag.php?userID=";
    public static String sendUserActionURL = "http://www.andnrby.com/integration/apps/v1.0/andnrby/prod/json_transaction.php?userID=";
    public static String fetchDealDetails = "http://www.andnrby.com/integration/apps/v1.0/andnrby/prod/dealDetails.php?userID=";
    public static String fetchFavouritesURL = "http://www.andnrby.com/integration/apps/v1.0/andnrby/prod/userfavourite.php?userID=";
    public static String fetchMyBrandsURL = "http://www.andnrby.com/integration/apps/v1.0/andnrby/prod/mybrands.php?userID=";
    public static String fetchBrandPage = "http://www.andnrby.com/integration/apps/v1.0/andnrby/prod/merchantDeals.php?merchantID=";
    public static String fetchNewLikesAndRedeems = "http://www.andnrby.com/integration/apps/v1.0/andnrby/prod/refreshDeals.php?userID=";
    public static String fetchDealGCMURL = "http://www.andnrby.com/integration/apps/v1.0/andnrby/prod/dealGCM.php?userID=";
    public static String deleteDealGCMURL = "http://www.andnrby.com/integration/apps/v1.0/andnrby/prod/json_dealsended.php?userID=";
    public static String referralURL = "http://www.andnrby.com/integration/apps/v1.0/andnrby/prod/userReferral.php?userID=";
    public static String fetchMerchantDetails = "http://www.andnrby.com/integration/apps/v1.0/andnrby/prod/merchantDetails.php?merchantID=";
    public static String sendFavouriteJsonData = "http://www.andnrby.com/integration/apps/v1.0/andnrby/prod/favouriteDeals.php";
    public static String fetchFollowedData = "http://www.andnrby.com/integration/apps/v1.0/andnrby/prod/brandDeals.php?merchantID=";
    public static String fetchAllBrandsURL = "http://www.andnrby.com/integration/apps/v1.0/andnrby/prod/allBrands.php";
    public static String fetchLikedAndRedeemedDeals = "http://www.andnrby.com/integration/apps/v1.0/andnrby/prod/userActions.php?userID=";
    public static String fetchActiveDealsURL = "http://www.andnrby.com/integration/apps/v1.0/andnrby/prod/activeDeals.php?userID=";
    public static String sendHistoryJsonDataURL = "http://www.andnrby.com/integration/apps/v1.0/andnrby/prod/showActiveDeals.php?userID=";
    public static String updateGcmId = "http://www.andnrby.com/integration/apps/v1.0/andnrby/prod/gcmUpdate.php?userId=";
    public static String searchStringURL = "http://www.andnrby.com/integration/apps/v1.0/andnrby/prod/searchBrand.php?searchData=";

}

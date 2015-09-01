package allegro; //allegroApi;

import java.net.URL;
import java.util.Iterator;
import java.util.List;


public class AllegroApi {

    ServiceService allegroWebApiService;      
    ServicePort allegro;
        
    private String userLogin = "SCRAPPY69DOO";          
    private String userPassword = "Marcin110887";
    private int countryCode = 1;
    private String webApiKey = "359ae72f";
    private int sysVar = 3; 
    private long verKey; 
    private String info;
    private int savedLocalId = 0;
    
    private boolean isTestModeOn = true;
    private URL wsdlLocation;
    
    private String sessionHandlePart;
    
    public AllegroApi() {
        if(isTestModeOn) {               
            userLogin = "SCRAPPY69DOO";          
            userPassword = "8e24a0b664620876";
            webApiKey = "s8e24a0b"; 
        }
        
        allegroWebApiService = new ServiceService();      
        allegro = allegroWebApiService.getServicePort();
        this.doQuerySysStatus();
        this.doLogin();
        
        System.out.println("ALLEGRO API: Połączono z Allegro");
    }
    
    private boolean doQuerySysStatus() {
        DoQuerySysStatusRequest request = new DoQuerySysStatusRequest();
        request.setWebapiKey(webApiKey);
        request.setCountryId(countryCode);
        request.setSysvar(sysVar);
        
        DoQuerySysStatusResponse response = allegro.doQuerySysStatus(request);
        this.verKey = response.getVerKey();
        this.info = response.getInfo();
        System.out.println("doQuerySysStatus: info: " + info + " | verKey:" + verKey);
        return true;
    }
    
    private boolean doLogin(){      
        DoLoginRequest doLoginRequest = new DoLoginRequest();
        doLoginRequest.setUserLogin(userLogin);
        doLoginRequest.setUserPassword(userPassword);
        doLoginRequest.setCountryCode(countryCode);
        doLoginRequest.setLocalVersion(verKey);
        doLoginRequest.setWebapiKey(webApiKey);

        DoLoginResponse doLoginResponse =  allegro.doLogin(doLoginRequest);
        if (!doLoginResponse.getSessionHandlePart().equals("")) {
            this.sessionHandlePart = doLoginResponse.getSessionHandlePart();
            System.out.println("doLogin: sessionHandlePart: " + sessionHandlePart);
            return true;
        } else {
            return false;
        }
    }
    
    public boolean doGetUserItems(int limit, int offset, int userId) {
        DoGetUserItemsRequest request = new DoGetUserItemsRequest();
        request.setCountryId(countryCode);
        request.setUserId(userId);//sandbox:43003059 allegro: 35376160
        request.setWebapiKey(webApiKey);
        //liczba zwracanych rekordow
        request.setLimit(limit);
        //Parametr  pozwalajacy ustalic  ktory limir  zwrocic
        request.setOffset(offset);
        DoGetUserItemsResponse response = allegro.doGetUserItems(request);
        List<UserItemList> itemList = response.getUserItemList().getItem();
        System.out.println("doGetUserItems: UserItemList:");
        for(int i=0; i<itemList.size(); i++) {
            System.out.println("UserItemList:" + itemList.get(i));
        }
        return true;        
    }
    
    
    /*
     * DRZEWO KATEGORII
     */
    
    public boolean doGetCategoryPath() {return false;}
    
    public boolean doGetCatsData() {
        DoGetCatsDataRequest request = new DoGetCatsDataRequest();
        request.setCountryId(this.countryCode);
        //Parametr zdezaktualizowany (należy przekazać dowolną wartość, odpowiednią dla typu parametru).
        request.setLocalVersion((long)1);
        request.setWebapiKey(this.webApiKey);
        
        DoGetCatsDataResponse response = allegro.doGetCatsData(request); 
        List<CatInfoType> catInfoTypeList = response.getCatsList().getItem();
        for(CatInfoType infoType : catInfoTypeList) {
            System.out.println(
                infoType.getCatId() + " " +
                infoType.getCatName() + " " +
                infoType.getCatIsProductCatalogueEnabled() + " " +
                infoType.getCatParent() + " " +
                infoType.getCatPosition() + " "
            );
        }
        
        return false;
    } 
    public boolean doGetCatsDataCount() {return false;} 
    
    public boolean doGetCatsDataLimit() {return false;}
        
    /*
     * Dzienniki zdarzeń
     */

    public void doGetSiteJournal() {
        DoGetSiteJournalRequest request = new DoGetSiteJournalRequest();
        request.setSessionHandle(this.sessionHandlePart);
        
        DoGetSiteJournalResponse dane = allegro.doGetSiteJournal(request);
        ArrayOfSitejournal arrayOfSitejournal = dane.getSiteJournalArray();
        List<SiteJournal> siteJournal = arrayOfSitejournal.getItem();
        for(SiteJournal site : siteJournal) {
            site.getRowId();
            
            System.out.println(site.getRowId() + " " + site.getItemId() + " " + site.getChangeType() + " " + site.getChangeDate() + " " + site.getCurrentPrice() + " " + site.getItemSellerId());
        }
    }
    
    public void doGetSiteJournalDeals() {
        System.out.println("doGetSiteJournalDeals");
        DoGetSiteJournalDealsRequest request = new DoGetSiteJournalDealsRequest();
        request.setSessionId(this.sessionHandlePart);
        //request.setJournalStart(verKey);
        
        DoGetSiteJournalDealsResponse response = allegro.doGetSiteJournalDeals(request);
        ArrayOfSitejournaldealsstruct siteJournalStruct = response.getSiteJournalDeals();
        List<SiteJournalDealsStruct> siteJournalList = siteJournalStruct.getItem();
        System.out.println("doGetSiteJournalDeals END");
        for(SiteJournalDealsStruct record : siteJournalList) {
            System.out.println(record.getDealBuyerId() + " " + record.getDealEventId() + " " + record.getDealEventTime() + " " + record.getDealEventType() + " " + record.getDealId() +
            " " + record.getDealItemId() + " " + record.getDealQuantity() + " " + record.getDealSellerId() + " " + record.getDealTransactionId());
        }                
    }
    
    public boolean doGetSiteJournalDealsInfo() {return false;} 
    
    public boolean doGetSiteJournalInfo() {return false;}
    
    /*
    *   WYSTAWIANIE OFERTY
    *
    */
    
    public boolean doCheckItemDescription() {
        return true;
    } 
    public boolean doCheckNewAuctionExt() {
        return true;
    }  
    public boolean doGetSellFormFieldsExt() {
        DoGetSellFormFieldsExtRequest request = new DoGetSellFormFieldsExtRequest();
        request.setCountryCode(this.countryCode);
        request.setLocalVersion(this.verKey);
        request.setWebapiKey(this.webApiKey);        
        DoGetSellFormFieldsExtResponse response = allegro.doGetSellFormFieldsExt(request);
        List<SellFormType> sellFormFieldsList = response.getSellFormFields().getItem();
        for(SellFormType sellFormType : sellFormFieldsList) {
            
            System.out.println("doGetSellFormFieldsExt: response:" +
                    sellFormType.getSellFormCat() + " || " +
                    sellFormType.getSellFormDefValue() + " || " +
                    sellFormType.getSellFormId() + " || " +
                    sellFormType.getSellFormLength() + " || " +
                    sellFormType.getSellFormOpt() + " || " +
                    sellFormType.getSellFormOptions() + " || " +
                    sellFormType.getSellFormParamId() + " || " +
                    sellFormType.getSellFormParentId() + " || " + 
                    sellFormType.getSellFormPos() + " || " +
                    sellFormType.getSellFormResType() + " || " + 
                    sellFormType.getSellFormType() + " || " +
                    sellFormType.getSellFormTitle() + " || " +
                    sellFormType.getSellFormDesc()+ " || " +
                    sellFormType.getSellFormFieldDesc() + " || " +
                    sellFormType.getSellMaxValue() + " || " +
                    sellFormType.getSellMinValue() + " || " +
                    sellFormType.getSellFormUnit() + " || " +                    
                    "");    
        }
      
        return true;
    }  
    public boolean doGetSellFormFieldsExtLimit() {
        return true;
    }  
    
    public boolean doGetSellFormFieldsForCategory(int categoryId) {
        //ASG 15041
        //REQUEST
        DoGetSellFormFieldsForCategoryRequest request = new DoGetSellFormFieldsForCategoryRequest();
        request.setCategoryId(categoryId);
        request.setCountryId(this.countryCode);
        request.setWebapiKey(this.webApiKey);
                
        //RESPONSE
        DoGetSellFormFieldsForCategoryResponse response = allegro.doGetSellFormFieldsForCategory(request);
        List<SellFormType> sellFormType = response.getSellFormFieldsForCategory().getSellFormFieldsList().getItem();
        for(SellFormType formType : sellFormType) {
            System.out.println(
                    "getSellFormCat " + formType.getSellFormCat() + " \n" +
                    "getSellFormDefValue " + formType.getSellFormDefValue() + " \n" +
                    "getSellFormDesc " + formType.getSellFormDesc() + " \n" +
                    //formType.getSellFormFieldDesc() + " \n" +
                    "getSellFormId " + formType.getSellFormId() + " \n" +
                    "getSellFormLength " + formType.getSellFormLength() + " \n" +
                            
                    "getSellFormOpt " + formType.getSellFormOpt() + " \n" +
                    "getSellFormOptions " + formType.getSellFormOptions() + " \n" +
                    "getSellFormOptsValues " + formType.getSellFormOptsValues() + " \n" +
                    
                    "getSellFormParamId " + formType.getSellFormParamId() + " \n" +
                    "getSellFormParamValues " + formType.getSellFormParamValues() + " \n" +
                            
                    "getSellFormParentId " + formType.getSellFormParentId() + " \n" +
                    "getSellFormParentValue " + formType.getSellFormParentValue() + " \n" +
                            
                    "getSellFormPos " + formType.getSellFormPos() + " \n" +
                    "getSellFormResType " + formType.getSellFormResType() + " \n" +
                    "getSellFormTitle " + formType.getSellFormTitle() + " \n" + 
                    "getSellFormType " + formType.getSellFormType() + " \n" +
                    "getSellFormUnit " + formType.getSellFormUnit() + " \n" +
                            
                    "getSellMaxValue " + formType.getSellMaxValue() + " \n" +
                    "getSellMinValue " + formType.getSellMinValue()
            );
            
            System.out.println("##########################################################");
        }
        
        return true;
    } 
    
    //Utworzenie nowej aukcji
    public boolean doNewAuctionExt() {
        int localId = getNextLocalId();
        
        //REQUEST
        DoNewAuctionExtRequest request = new DoNewAuctionExtRequest();
        
        //Required
        request.setSessionHandle(this.sessionHandlePart);
        
        //Fields
        ArrayOfFieldsvalue arrayOfFieldsvalue = new ArrayOfFieldsvalue();
        
        FieldsValue field = new FieldsValue();

        request.setFields(arrayOfFieldsvalue);

        //Not Required
        request.setLocalId(localId);
        request.setItemTemplateCreate(null);
        request.setItemTemplateId(localId);
        request.setTags(null);
        request.setVariants(null);

        //RESPONSE
        DoNewAuctionExtResponse response = allegro.doNewAuctionExt(request);
        System.out.println("doNewAuctionExt: response:" + response);
        
        //VERIFY
        if(!this.doVerifyItem(localId)) {
            return false;
        } else {
            return true;
        }
    } 
    
    public boolean doSellSomeAgain() {
        return true;
    }  
    
    /*
     *   #REQUEST      
     *   @param: sessionHandle |  string | wymagany
     *   Identyfikator sesji użytkownika, uzyskany za pomocą metody doLogin(Enc).
     *   @param: sellItemsArray | long[] | wymagany
     *   Tablica identyfikatorów ofert, które mają zostać wystawione ponownie (maks. 25).
     *   @param: sellStartingTime | long | niewymagany
     *   Data wystawienia oferty (w formacie Unix time). W przypadku gdy oferty mają zostać wystawione od razu, w parametrze tym należy przekazać 0.
     *   @param: sellShopDuration | int | wymagany
     *   Czas trwania oferty w dniach (jedyna dozwolona wartość dla Sklepu Allegro to: 30).
     *   @param: sellShopOptions | int | niewymagany
     *   Parametr pozwalający na wskazanie dodatkowych czynności, które mają zostać wykonane po ponownym wystawieniu oferty (1 - źródłowe oferty zostaną usunięte z odpowiedniej zakładki w Moim Allegro, 2 - zostanie wysłany e-mail potwierdzający wystawienie, 3 - obie wymienione).
     *   @param: sellProlongOptions | int | niewymagany
     *   Parametr pozwalający na ustawienie wznawiana ofert po ich zakończeniu (0 - wyłączenie wznawiania ofert, 1 - wznawianie ofert z pełnym zestawem przedmiotów, 2 - wznawianie ofert jedynie z niesprzedanymi przedmiotami). Domyślną wartością jest 0.
     *   @param: sellShopCategory | long | niewymagany
     *   Identyfikator kategorii użytkownika w Sklepie Allegro (listę identyfikatorów kategorii sklepowych zalogowanego użytkownika uzyskać można za pomocą metody doGetShopCatsData). W przypadku przekazania w parametrze wartości domyślnej (0), oferty wystawione zostaną w kategoriach sklepowych ofert źródłowych (jeśli kategoria sklepowa w danej ofercie źródłowej nie została wybrana, oferta na jej podstawie wystawiona zostanie w kategorii Pozostałe).
     *   @param: localIds | int[] | niewymagany
     *   Tablica lokalnych identyfikatorów, które mają zostać dodatkowo nadane ofertom (zakres: 1-9999999999999).
     */
    public boolean doSellSomeAgainInShop(long[] sellItemsTable, int setSellShopOptions, long sellShopCategory, int[] localIdsTable) {
        DoSellSomeAgainInShopRequest doSellSomeAgainInShopRequest = new DoSellSomeAgainInShopRequest();
        doSellSomeAgainInShopRequest.setSessionHandle(this.sessionHandlePart);
        ArrayOfLong sellItemsArray = new ArrayOfLong();
        for(long value : sellItemsTable) {
            sellItemsArray.getItem().add(value);
        }
        doSellSomeAgainInShopRequest.setSellItemsArray(sellItemsArray);
        doSellSomeAgainInShopRequest.setSellStartingTime(new Long(0));
        doSellSomeAgainInShopRequest.setSellShopDuration(30); 
        doSellSomeAgainInShopRequest.setSellShopOptions(setSellShopOptions);
        doSellSomeAgainInShopRequest.setSellProlongOptions(2); 
        doSellSomeAgainInShopRequest.setSellShopCategory(sellShopCategory); 
        ArrayOfInt localIdsArray = new ArrayOfInt();        
        for(int value : localIdsTable) {
            localIdsArray.getItem().add(value);
        }
        doSellSomeAgainInShopRequest.setLocalIds(localIdsArray);

        DoSellSomeAgainInShopResponse doSellSomeAgainInShopResponse = allegro.doSellSomeAgainInShop(doSellSomeAgainInShopRequest);        
        return true;
    }  
    
    /*
     * #REQUEST
     * @param: sessionHandle | string | wymagany
     * Identyfikator sesji użytkownika, uzyskany za pomocą metody doLogin(Enc).
     * @param: localId | int | wymagany
     * Wartość lokalnego identyfikatora, który przekazany został w momencie wystawiania oferty za pomocą metody doNewAuctionExt/doSellSomeAgain/doSellSomeAgainShop.
     * 
     * #RESPONSE
     * @param: itemId | long
     * Identyfikator oferty (lub -1 w przypadku, w którym podany lokalny identyfikator jest niepoprawny).
     * @param: itemListed | int
     * Status wystawienia oferty (-1 - oferta nie została i nie zostanie już wystawiona z powodu problemów występujących po stronie Allegro lub z powodu podania niepoprawnego lokalnego identyfikatora, 0 - oferta czeka w kolejce na wystawienie, 1 - oferta została wystawiona poprawnie, 2 - oferta zaplanowana do wystawienia (czeka na wystawienie w czasie ustalonym przez sprzedającego w formularzu sprzedaży), 3 - oferta czeka na ponowne wystawienie (dotyczy aukcji wystawionych ponownie za pomocą doSellSomeAgain/doSellSomeAgainShop)).
     * @param: itemStartingTime | long
     * Czas rozpoczęcia oferty (w formacie Unix time; dotyczy wszystkich ofert - zaplanowanych do wystawienia, oczekujących na ponowne wystawienie oraz tych już wystawionych).
     */
    public boolean doVerifyItem(int localId) {
        DoVerifyItemRequest verifyRequest = new DoVerifyItemRequest();
        verifyRequest.setSessionHandle(this.sessionHandlePart);
        verifyRequest.setLocalId(localId);
        
        //Response
        DoVerifyItemResponse verifyResponse = allegro.doVerifyItem(verifyRequest);
        long itemId = verifyResponse.getItemId();
        String komunikat = "";
        int itemListed = verifyResponse.getItemListed();
        switch(itemListed) {
            case -1: 
                komunikat = "oferta nie została i nie zostanie już wystawiona z powodu problemów występujących po stronie Allegro lub z powodu podania niepoprawnego lokalnego identyfikatora";
                break;
            case 0:
                komunikat = "oferta czeka w kolejce na wystawienie";
                break;
            case 1:
                komunikat = "oferta została wystawiona poprawnie";
                break;
            case 2:
                komunikat = "oferta zaplanowana do wystawienia (czeka na wystawienie w czasie ustalonym przez sprzedającego w formularzu sprzedaży)";
                break;
            case 3:
                komunikat = "oferta czeka na ponowne wystawienie (dotyczy aukcji wystawionych ponownie za pomocą doSellSomeAgain/doSellSomeAgainShop)";
                break;
        }
          
        
        System.out.println("doVerifyItem: itemId: " + itemId + " getItemListed: " + komunikat);
        if(itemListed == 1) {
            return true;
        } else {
            return false;
        }        
    } 
    
    
    /*
    *   WYSZUKIWARKA I LISTINGI
    *
    */
    public boolean doGetItemsList() {
        return true;
    }   
    public boolean doGetSellFormAttribs() {
        return true;
    }  
    public boolean doGetSpecialItems() {
        return true;
    } 
    
    public boolean doSearch(String searchString) {
        DoSearchRequest request = new DoSearchRequest();
        request.setSessionHandle(sessionHandlePart);
        
        //Parametry wyszukiwania
        SearchOptType searchQuery = new SearchOptType();
        searchQuery.setSearchString(searchString);
        
        //Przygotowanie Requesta
        request.setSearchQuery(searchQuery);
        
        DoSearchResponse response = allegro.doSearch(request);
        
        System.out.println("doSearch: response.getSearchCount: " + response.getSearchCount());
        return true;
    }

    public boolean doShowCat() {
        return true;
    } 

    private int getNextLocalId() {
        return savedLocalId++;
    }
    
    public boolean doGetMySellItems(int numerStrony) {
        DoGetMySellItemsRequest parameters = new DoGetMySellItemsRequest();
        parameters.setSessionId(sessionHandlePart);
        parameters.getItemIds();
        parameters.setPageSize(1000);
        parameters.setPageNumber(numerStrony);

        DoGetMySellItemsResponse dane = allegro.doGetMySellItems(parameters);
                
        int iloscRekordow = dane.getSellItemsCounter();
        System.out.println("doGetMySellItems Liczba rekordów: " + iloscRekordow);
        
        ArrayOfSellitemstruct elementy = dane.getSellItemsList();

        SellItemStruct element;
        for (Iterator<SellItemStruct> elIterator = elementy.getItem().iterator(); elIterator.hasNext();){
            element = elIterator.next();
            System.out.println(element.getItemTitle() + " " + element.getItemId());
        }
        
        return true;
    }   
}

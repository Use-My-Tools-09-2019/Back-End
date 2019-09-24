# UseremailControllerApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNewQuoteUsingPOST**](UseremailControllerApi.md#addNewQuoteUsingPOST) | **POST** /useremails/useremail | addNewQuote
[**deleteQuoteByIdUsingDELETE**](UseremailControllerApi.md#deleteQuoteByIdUsingDELETE) | **DELETE** /useremails/useremail/{useremailid} | deleteQuoteById
[**findQuoteByUserNameUsingGET**](UseremailControllerApi.md#findQuoteByUserNameUsingGET) | **GET** /useremails/username/{userName} | findQuoteByUserName
[**getUserEmailByIdUsingGET**](UseremailControllerApi.md#getUserEmailByIdUsingGET) | **GET** /useremails/useremail/{useremailId} | getUserEmailById
[**listAllUseremailsUsingGET**](UseremailControllerApi.md#listAllUseremailsUsingGET) | **GET** /useremails/useremails | listAllUseremails


## **addNewQuoteUsingPOST**

addNewQuote

### Example
```bash
 addNewQuoteUsingPOST
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **newUseremail** | [**Useremail**](Useremail.md) | newUseremail |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **deleteQuoteByIdUsingDELETE**

deleteQuoteById

### Example
```bash
 deleteQuoteByIdUsingDELETE useremailid=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **useremailid** | **integer** | useremailid |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **findQuoteByUserNameUsingGET**

findQuoteByUserName

### Example
```bash
 findQuoteByUserNameUsingGET userName=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **string** | userName |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getUserEmailByIdUsingGET**

getUserEmailById

### Example
```bash
 getUserEmailByIdUsingGET useremailId=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **useremailId** | **integer** | useremailId |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **listAllUseremailsUsingGET**

listAllUseremails

### Example
```bash
 listAllUseremailsUsingGET
```

### Parameters
This endpoint does not need any parameter.

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


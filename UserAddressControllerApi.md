# UserAddressControllerApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNewAddressUsingPOST**](UserAddressControllerApi.md#addNewAddressUsingPOST) | **POST** /address/add | Creates a New User Address
[**getAddressByUserUsingGET**](UserAddressControllerApi.md#getAddressByUserUsingGET) | **GET** /address/{user} | Retrieve Rental Associated with the Provided User
[**updateAddressUsingPUT**](UserAddressControllerApi.md#updateAddressUsingPUT) | **PUT** /address/update/{userId} | Updates the information for an address associated with the corresponding userId


## **addNewAddressUsingPOST**

Creates a New User Address

Newly Created User Address Id Sent In Response Header

### Example
```bash
 addNewAddressUsingPOST
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **newAddress** | [**UserAddress**](UserAddress.md) | newAddress |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getAddressByUserUsingGET**

Retrieve Rental Associated with the Provided User

### Example
```bash
 getAddressByUserUsingGET user=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | **string** | User |

### Return type

[**UserAddress**](UserAddress.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **updateAddressUsingPUT**

Updates the information for an address associated with the corresponding userId

### Example
```bash
 updateAddressUsingPUT userId=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateAddress** | [**UserAddress**](UserAddress.md) | updateAddress |
 **userId** | **integer** | User Id |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


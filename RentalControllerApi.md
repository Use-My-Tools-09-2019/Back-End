# RentalControllerApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRentalByIdUsingGET**](RentalControllerApi.md#getRentalByIdUsingGET) | **GET** /rentals/rental/{rentalId} | Retrieve Rental Associated with the Provided Rental Id
[**listAllRentalsUsingGET**](RentalControllerApi.md#listAllRentalsUsingGET) | **GET** /rentals/rentals | Return all Rentals using Paging and Sorting
[**listRentalsByUserUsingGET**](RentalControllerApi.md#listRentalsByUserUsingGET) | **GET** /rentals/rental/{user} | Retrieve Rental Associated with the Provided User


## **getRentalByIdUsingGET**

Retrieve Rental Associated with the Provided Rental Id

### Example
```bash
 getRentalByIdUsingGET rentalId=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rentalId** | **integer** | Rental Id |

### Return type

[**Rental**](Rental.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **listAllRentalsUsingGET**

Return all Rentals using Paging and Sorting

### Example
```bash
 listAllRentalsUsingGET  page=value  size=value  Specify as:  sort=value1 sort=value2 sort=...
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**Object**](.md) | Results page you want to retrieve (0..N) | [optional]
 **size** | [**Object**](.md) | Number of records per page. | [optional]
 **sort** | [**array[string]**](string.md) | Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional]

### Return type

[**Rental**](Rental.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **listRentalsByUserUsingGET**

Retrieve Rental Associated with the Provided User

### Example
```bash
 listRentalsByUserUsingGET user=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | **string** | User |

### Return type

[**Rental**](Rental.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


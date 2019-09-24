# ToolControllerApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNewToolUsingPOST**](ToolControllerApi.md#addNewToolUsingPOST) | **POST** /tools/tool/add | Creates a New Tool
[**deleteToolByIdUsingDELETE**](ToolControllerApi.md#deleteToolByIdUsingDELETE) | **DELETE** /tools/tool/delete/{toolId} | Deletes a Tool Based on Id
[**getToolByIdUsingGET**](ToolControllerApi.md#getToolByIdUsingGET) | **GET** /tools/tool/{toolId} | Retrieve Tool Associated with the Provided Tool Id
[**listAllToolsUsingGET**](ToolControllerApi.md#listAllToolsUsingGET) | **GET** /tools/tools | Return all Tools using Paging and Sorting
[**listToolsAvailableToRentUsingGET**](ToolControllerApi.md#listToolsAvailableToRentUsingGET) | **GET** /tools/available | Return All Tools Where Available is True
[**listToolsByNameLikeUsingGET**](ToolControllerApi.md#listToolsByNameLikeUsingGET) | **GET** /tools/namelike/{toolName} | Return All Tools with a Name Like
[**listToolsByRentalCostUsingGET**](ToolControllerApi.md#listToolsByRentalCostUsingGET) | **GET** /tools/rentals/{cost} | Return All Tools by Variable Cost
[**listToolsByTypeLikeUsingGET**](ToolControllerApi.md#listToolsByTypeLikeUsingGET) | **GET** /tools/typelike/{toolType} | Return All Tools with a Type Like
[**listToolsThatAreRentalsUsingGET**](ToolControllerApi.md#listToolsThatAreRentalsUsingGET) | **GET** /tools/rentals | Return All Tools Where Rental is True
[**updateToolUsingPUT**](ToolControllerApi.md#updateToolUsingPUT) | **PUT** /tools/tool/update/{toolId} | Updates The Information For a Tool Associated with the Provided Tool Id


## **addNewToolUsingPOST**

Creates a New Tool

Newly Created Tool Id Sent In Response Header

### Example
```bash
 addNewToolUsingPOST
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **newTool** | [**Tool**](Tool.md) | newTool |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **deleteToolByIdUsingDELETE**

Deletes a Tool Based on Id

### Example
```bash
 deleteToolByIdUsingDELETE toolId=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolId** | **integer** | Tool Id |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getToolByIdUsingGET**

Retrieve Tool Associated with the Provided Tool Id

### Example
```bash
 getToolByIdUsingGET toolId=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolId** | **integer** | Tool Id |

### Return type

[**Tool**](Tool.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **listAllToolsUsingGET**

Return all Tools using Paging and Sorting

Exposes All User Information Associated With a Tool and Tool Rentals. Requires Admin Role to Access

### Example
```bash
 listAllToolsUsingGET  page=value  size=value  Specify as:  sort=value1 sort=value2 sort=...
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**Object**](.md) | Results page you want to retrieve (0..N) | [optional]
 **size** | [**Object**](.md) | Number of records per page. | [optional]
 **sort** | [**array[string]**](string.md) | Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional]

### Return type

[**Tool**](Tool.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **listToolsAvailableToRentUsingGET**

Return All Tools Where Available is True

### Example
```bash
 listToolsAvailableToRentUsingGET
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Tool**](Tool.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **listToolsByNameLikeUsingGET**

Return All Tools with a Name Like

### Example
```bash
 listToolsByNameLikeUsingGET toolName=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolName** | **string** | Tool Name |

### Return type

[**Tool**](Tool.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **listToolsByRentalCostUsingGET**

Return All Tools by Variable Cost

### Example
```bash
 listToolsByRentalCostUsingGET cost=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cost** | **float** | Rental Cost |

### Return type

[**Tool**](Tool.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **listToolsByTypeLikeUsingGET**

Return All Tools with a Type Like

### Example
```bash
 listToolsByTypeLikeUsingGET toolType=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolType** | **string** | Tool Type |

### Return type

[**Tool**](Tool.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **listToolsThatAreRentalsUsingGET**

Return All Tools Where Rental is True

### Example
```bash
 listToolsThatAreRentalsUsingGET
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Tool**](Tool.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **updateToolUsingPUT**

Updates The Information For a Tool Associated with the Provided Tool Id

### Example
```bash
 updateToolUsingPUT toolId=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolId** | **integer** | Tool Id |
 **updateTool** | [**Tool**](Tool.md) | updateTool |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


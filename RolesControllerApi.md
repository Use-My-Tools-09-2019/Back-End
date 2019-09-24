# RolesControllerApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNewRoleUsingPOST**](RolesControllerApi.md#addNewRoleUsingPOST) | **POST** /roles/role | addNewRole
[**deleteRoleByIdUsingDELETE**](RolesControllerApi.md#deleteRoleByIdUsingDELETE) | **DELETE** /roles/role/{id} | deleteRoleById
[**getRoleByIdUsingGET**](RolesControllerApi.md#getRoleByIdUsingGET) | **GET** /roles/role/{roleId} | getRoleById
[**getRoleByNameUsingGET**](RolesControllerApi.md#getRoleByNameUsingGET) | **GET** /roles/role/name/{roleName} | getRoleByName
[**listRolesUsingGET**](RolesControllerApi.md#listRolesUsingGET) | **GET** /roles/roles | listRoles


## **addNewRoleUsingPOST**

addNewRole

### Example
```bash
 addNewRoleUsingPOST
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **newRole** | [**Role**](Role.md) | newRole |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **deleteRoleByIdUsingDELETE**

deleteRoleById

### Example
```bash
 deleteRoleByIdUsingDELETE id=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **integer** | id |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getRoleByIdUsingGET**

getRoleById

### Example
```bash
 getRoleByIdUsingGET roleId=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **integer** | roleId |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getRoleByNameUsingGET**

getRoleByName

### Example
```bash
 getRoleByNameUsingGET roleName=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleName** | **string** | roleName |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **listRolesUsingGET**

listRoles

### Example
```bash
 listRolesUsingGET
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


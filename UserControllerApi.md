# UserControllerApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNewUserUsingPOST1**](UserControllerApi.md#addNewUserUsingPOST1) | **POST** /users/user | addNewUser
[**deleteUserByIdUsingDELETE**](UserControllerApi.md#deleteUserByIdUsingDELETE) | **DELETE** /users/user/{id} | deleteUserById
[**deleteUserRoleByIdsUsingDELETE**](UserControllerApi.md#deleteUserRoleByIdsUsingDELETE) | **DELETE** /users/user/{userid}/role/{roleid} | deleteUserRoleByIds
[**getCurrentUserNameUsingGET**](UserControllerApi.md#getCurrentUserNameUsingGET) | **GET** /users/getusername | getCurrentUserName
[**getUserByIdUsingGET**](UserControllerApi.md#getUserByIdUsingGET) | **GET** /users/user/{userId} | getUserById
[**getUserByNameUsingGET**](UserControllerApi.md#getUserByNameUsingGET) | **GET** /users/user/name/{userName} | getUserByName
[**listAllUsersUsingGET**](UserControllerApi.md#listAllUsersUsingGET) | **GET** /users/users | listAllUsers
[**postUserRoleByIdsUsingPOST**](UserControllerApi.md#postUserRoleByIdsUsingPOST) | **POST** /users/user/{userid}/role/{roleid} | postUserRoleByIds
[**updateUserUsingPUT**](UserControllerApi.md#updateUserUsingPUT) | **PUT** /users/user/{id} | updateUser


## **addNewUserUsingPOST1**

addNewUser

### Example
```bash
 addNewUserUsingPOST1
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **newuser** | [**User**](User.md) | newuser |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **deleteUserByIdUsingDELETE**

deleteUserById

### Example
```bash
 deleteUserByIdUsingDELETE id=value
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

## **deleteUserRoleByIdsUsingDELETE**

deleteUserRoleByIds

### Example
```bash
 deleteUserRoleByIdsUsingDELETE roleid=value userid=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleid** | **integer** | roleid |
 **userid** | **integer** | userid |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getCurrentUserNameUsingGET**

getCurrentUserName

### Example
```bash
 getCurrentUserNameUsingGET  authenticated=value  authorities[0].authority=value  Specify as:   Specify as:   Specify as: 
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticated** | **boolean** |  | [optional]
 **authorities[0].authority** | **string** |  | [optional]
 **credentials** | [**map[String, string]**](string.md) |  | [optional]
 **details** | [**map[String, string]**](string.md) |  | [optional]
 **principal** | [**map[String, string]**](string.md) |  | [optional]

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getUserByIdUsingGET**

getUserById

### Example
```bash
 getUserByIdUsingGET userId=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **integer** | userId |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getUserByNameUsingGET**

getUserByName

### Example
```bash
 getUserByNameUsingGET userName=value
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

## **listAllUsersUsingGET**

listAllUsers

### Example
```bash
 listAllUsersUsingGET
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

## **postUserRoleByIdsUsingPOST**

postUserRoleByIds

### Example
```bash
 postUserRoleByIdsUsingPOST roleid=value userid=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleid** | **integer** | roleid |
 **userid** | **integer** | userid |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **updateUserUsingPUT**

updateUser

### Example
```bash
 updateUserUsingPUT id=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **integer** | id |
 **updateUser** | [**User**](User.md) | updateUser |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


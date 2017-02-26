# Documentation for API endpoints

All URIs are relative to *https://api.postmarkapp.com/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DomainsAPIApi* | [**createDomain**](docs/DomainsAPIApi.md#createDomain) | **POST** /domains | Create a Domain
*DomainsAPIApi* | [**deleteDomain**](docs/DomainsAPIApi.md#deleteDomain) | **DELETE** /domains/{domainid} | Delete a Domain
*DomainsAPIApi* | [**editDomain**](docs/DomainsAPIApi.md#editDomain) | **PUT** /domains/{domainid} | Update a Domain
*DomainsAPIApi* | [**getDomain**](docs/DomainsAPIApi.md#getDomain) | **GET** /domains/{domainid} | Get a Domain
*DomainsAPIApi* | [**listDomains**](docs/DomainsAPIApi.md#listDomains) | **GET** /domains | List Domains
*DomainsAPIApi* | [**requestSPFVerificationForDomain**](docs/DomainsAPIApi.md#requestSPFVerificationForDomain) | **POST** /domains/{domainid}/verifyspf | Request DNS Verification for SPF
*DomainsAPIApi* | [**rotateDKIMKeyForDomain**](docs/DomainsAPIApi.md#rotateDKIMKeyForDomain) | **POST** /domains/{domainid}/rotatedkim | Rotate DKIM Key
*SenderSignaturesAPIApi* | [**createSenderSignature**](docs/SenderSignaturesAPIApi.md#createSenderSignature) | **POST** /senders | Create a Sender Signature
*SenderSignaturesAPIApi* | [**deleteSenderSignature**](docs/SenderSignaturesAPIApi.md#deleteSenderSignature) | **DELETE** /senders/{signatureid} | Delete a Sender Signature
*SenderSignaturesAPIApi* | [**editSenderSignature**](docs/SenderSignaturesAPIApi.md#editSenderSignature) | **PUT** /senders/{signatureid} | Update a Sender Signature
*SenderSignaturesAPIApi* | [**getSenderSignature**](docs/SenderSignaturesAPIApi.md#getSenderSignature) | **GET** /senders/{signatureid} | Get a Sender Signature
*SenderSignaturesAPIApi* | [**listSenderSignatures**](docs/SenderSignaturesAPIApi.md#listSenderSignatures) | **GET** /senders | List Sender Signatures
*SenderSignaturesAPIApi* | [**requestNewDKIMKeyForSenderSignature**](docs/SenderSignaturesAPIApi.md#requestNewDKIMKeyForSenderSignature) | **POST** /senders/{signatureid}/requestnewdkim | Request a new DKIM Key
*SenderSignaturesAPIApi* | [**requestSPFVerificationForSenderSignature**](docs/SenderSignaturesAPIApi.md#requestSPFVerificationForSenderSignature) | **POST** /senders/{signatureid}/verifyspf | Request DNS Verification for SPF
*SenderSignaturesAPIApi* | [**resendSenderSignatureConfirmationEmail**](docs/SenderSignaturesAPIApi.md#resendSenderSignatureConfirmationEmail) | **POST** /senders/{signatureid}/resend | Resend Signature Confirmation Email
*ServerManagementAPIApi* | [**createServer**](docs/ServerManagementAPIApi.md#createServer) | **POST** /servers | Create a Server
*ServerManagementAPIApi* | [**deleteServer**](docs/ServerManagementAPIApi.md#deleteServer) | **DELETE** /servers/{serverid} | Delete a Server
*ServerManagementAPIApi* | [**editServerInformation**](docs/ServerManagementAPIApi.md#editServerInformation) | **PUT** /servers/{serverid} | Edit a Server
*ServerManagementAPIApi* | [**getServerInformation**](docs/ServerManagementAPIApi.md#getServerInformation) | **GET** /servers/{serverid} | Get a Server
*ServerManagementAPIApi* | [**listServers**](docs/ServerManagementAPIApi.md#listServers) | **GET** /servers | List servers


## Documentation for Models

 - [CreateServerPayload](docs/CreateServerPayload.md)
 - [DKIMRotationResponse](docs/DKIMRotationResponse.md)
 - [DomainCreationModel](docs/DomainCreationModel.md)
 - [DomainEditingModel](docs/DomainEditingModel.md)
 - [DomainExtendedInformation](docs/DomainExtendedInformation.md)
 - [DomainInformation](docs/DomainInformation.md)
 - [DomainListingResults](docs/DomainListingResults.md)
 - [DomainSPFResult](docs/DomainSPFResult.md)
 - [EditServerPayload](docs/EditServerPayload.md)
 - [ExtendedServerInfo](docs/ExtendedServerInfo.md)
 - [SenderListingResults](docs/SenderListingResults.md)
 - [SenderSignatureCreationModel](docs/SenderSignatureCreationModel.md)
 - [SenderSignatureEditingModel](docs/SenderSignatureEditingModel.md)
 - [SenderSignatureExtendedInformation](docs/SenderSignatureExtendedInformation.md)
 - [SenderSignatureInformation](docs/SenderSignatureInformation.md)
 - [ServerListingResponse](docs/ServerListingResponse.md)
 - [StandardPostmarkResponse](docs/StandardPostmarkResponse.md)


## Documentation for Authorization

Authentication happens using an authentication HTTP header. Use the API key generated through the Postmark website for this particular API.

## Example usage

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import net.nextpulse.postmarkapp.api.*;
import net.nextpulse.postmarkapp.api.auth.*;
import net.nextpulse.postmarkapp.models.account.*;
import net.nextpulse.postmarkapp.api.account.DomainsAPIApi;

public class DomainsAPIApiExample {

    public static void main(String[] args) {
        
        DomainsAPIApi apiInstance = new DomainsAPIApi();
        String xPostmarkAccountToken = "xPostmarkAccountToken_example"; // String | The token associated with the Account on which this request will operate.
        DomainCreationModel body = new DomainCreationModel(); // DomainCreationModel | 
        try {
            DomainExtendedInformation result = apiInstance.createDomain(xPostmarkAccountToken, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DomainsAPIApi#createDomain");
            e.printStackTrace();
        }
    }
}

```
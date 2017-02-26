# postmarkapp

A Java API client for the APIs offered by [Postmark](https://postmarkapp.com/api-explorer), allowing you to send and receive e-mail from your Java application using the Server API.
Furthermore, you can configure your Postmark account using the Account API.

The code in this repository is generated using [Swagger Codegen](https://github.com/swagger-api/swagger-codegen).

## Installation

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>net.nextpulse</groupId>
    <artifactId>postmarkapp</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Example usage

Please follow the [installation](#installation) instructions. 
Once this is done, you can invoke the Server API using the following code:

```java
import net.nextpulse.postmarkapp.api.*;
import net.nextpulse.postmarkapp.api.auth.*;
import net.nextpulse.postmarkapp.models.server.*;
import net.nextpulse.postmarkapp.api.server.BouncesAPIApi;

public class BouncesAPIApiExample {

    public static void main(String[] args) {
        BouncesAPIApi apiInstance = new BouncesAPIApi();
        String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
        Long bounceid = 789L; // Long | The ID of the Bounce to activate.
        try {
            BounceActivationResponse result = apiInstance.activateBounce(xPostmarkServerToken, bounceid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BouncesAPIApi#activateBounce");
            e.printStackTrace();
        }
    }
}
```

Similarly, you can invoke the Accounts API using the code below. Note that you have to use your Accounts API token for these calls.

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

## Documentation

Documentation for the different API endpoints can be found here:

* [Server API](docs/ServerApiIndex.md), allowing you to retrieve email caught by the Postmark API, send out new emails, manage bounces and statistics.
* [Accounts API](docs/AccountApiIndex.md), allowing you to add additional domain names, manage senders.


## Development

To (re)generate the client code, execute `mvn compile`. This will generate new source files and compile them. Using `mvn deploy -P release`, a new version may be related to Maven Central.
/*
Copyright (c) Microsoft Open Technologies, Inc.
All Rights Reserved
See License.txt in the project root for license information.
*/
package microsoft.aspnet.signalr.client.http.java

import android.os.Build
import microsoft.aspnet.signalr.client.Logger
import microsoft.aspnet.signalr.client.Platform
import microsoft.aspnet.signalr.client.PlatformComponent
import microsoft.aspnet.signalr.client.http.HttpConnection

class AndroidPlatformComponent : PlatformComponent {
    override fun createHttpConnection(logger: Logger?): HttpConnection? {
        return Platform.createDefaultHttpConnection(logger)
    }

    override fun getOSName(): String {
        return "android"
    }

}
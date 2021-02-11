package main.kotlin.core.src

import com.github.nkzawa.socketio.client.IO
import com.github.nkzawa.socketio.client.Socket
import java.net.URISyntaxException

// get the socket URL

class SocketInstance : Application() {
    // socket.io connection url
    private var mSocket: Socket? = null

    override fun onCreate() {
        super.onCreate()
        try {
            // creating socket instance
            mSocket = IO.socket(URL)
        } catch (e: URISyntaxException) {
            throw RuntimeException(e)
        }
    }

    // return socket instance
    fun getMSocket(): Socket? {
        return mSocket
    }

    // Emit and listen events
    mSocket?.on("EVENT_NAME") { args ->
        if (args[0] != null)
        {
            data = args[0] as String
            Log.d(“output”,data.toString())
            runOnUiThread {
                Toast.makeText(this,”Data received from socket”,Toast.LENGTH_SHORT).show()
            }
        }
    }

}
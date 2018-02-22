package org.naivechain.block;


import org.java_websocket.WebSocketImpl;

/**
 * Created by hongsen on 2017/7/6.
 */
public class BlockServiceTest {
    public static void main(String args[]){
        WebSocketImpl.DEBUG = false;
        int port = 8887; // 端口
        WsServer s = new WsServer(port);
        s.start();
    }
}
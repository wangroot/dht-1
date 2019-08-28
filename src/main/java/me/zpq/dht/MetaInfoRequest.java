package me.zpq.dht;


public class MetaInfoRequest {

    private String ip;

    private int port;

    private String infoHash;

    public MetaInfoRequest() {
    }

    public MetaInfoRequest(String ip, int port, String infoHash) {
        this.ip = ip;
        this.port = port;
        this.infoHash = infoHash;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getInfoHash() {
        return infoHash;
    }

    public void setInfoHash(String infoHash) {
        this.infoHash = infoHash;
    }

    @Override
    public String toString() {
        return "{\"ip\":\"" + ip + "\",\"port\":" + port + ",\"infoHash\":\"" + infoHash + "\"}";
    }
}

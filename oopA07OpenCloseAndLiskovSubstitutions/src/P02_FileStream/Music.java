package P02_FileStream;

public class Music implements Streamable {

    @SuppressWarnings("unused")
	private String artist;
    @SuppressWarnings("unused")
	private String album;
    private int length;
    private int bytesSent;

    @Override
    public int getLength() {
        return length;
    }
    @Override
    public int getBytesSent() {
        return bytesSent;
    }
}

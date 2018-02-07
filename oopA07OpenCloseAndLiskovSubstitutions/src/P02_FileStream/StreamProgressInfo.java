package P02_FileStream;

public class StreamProgressInfo {
    private Streamable stream;

    // If we want to stream a music file, we can't
    public StreamProgressInfo(Streamable stream) {
        this.stream = stream;
    }

    public int calculateCurrentPercent() {
        return (this.stream.getBytesSent() * 100) / this.stream.getLength();
    }
}

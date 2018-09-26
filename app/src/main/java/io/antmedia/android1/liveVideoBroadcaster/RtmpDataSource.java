package io.antmedia.android1.liveVideoBroadcaster;

import android.net.Uri;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;

import net.butterflytv.rtmp_client.RtmpClient;

import java.io.IOException;

/**
 * Created by ocittwo on 6/16/17.
 *
 * @Author Ahmad Rosid
 * @Email ocittwo@gmail.com
 * @Github https://github.com/ar-android
 * @Web http://ahmadrosid.com
 */

public class RtmpDataSource implements DataSource {

    public static class RtmpDataSourceFactory implements DataSource.Factory {

        @Override
        public DataSource createDataSource() {
            return new RtmpDataSource();
        }
    }

    private final RtmpClient rtmpClient;
    private Uri uri;

    public RtmpDataSource() {
        rtmpClient = new RtmpClient();
    }


    @Override
    public Uri getUri() {
        return uri;
    }

    @Override
    public long open(DataSpec dataSpec) throws IOException {
        uri = dataSpec.uri;
        rtmpClient.open(dataSpec.uri.toString(), false);
        /*if (result < 0) {
            return 0;
        }*/
        return C.LENGTH_UNSET;
    }

    @Override
    public void close() throws IOException {
        rtmpClient.close();
    }

    @Override
    public int read(byte[] buffer, int offset, int readLength) throws IOException {
        return rtmpClient.read(buffer, offset, readLength);

    }
}

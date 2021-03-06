package mertz.security.oauth2.provider.token.store.cassandra.model;

import java.nio.ByteBuffer;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table(value = RefreshToken.TABLE)
public class RefreshToken {

    public static final String TABLE = "refresh";

    @PrimaryKey
    private String     tokenId;

    // Serialized
    private ByteBuffer oAuth2RefreshToken;

    public RefreshToken(String tokenId, ByteBuffer oAuth2RefreshToken) {
        super();
        this.tokenId = tokenId;
        this.oAuth2RefreshToken = oAuth2RefreshToken;
    }

    public final String getTokenId() {
        return tokenId;
    }

    public final ByteBuffer getoAuth2RefreshToken() {
        return oAuth2RefreshToken;
    }

    @Override
    public String toString() {
        return "RefreshToken [tokenId=" + tokenId + "]";
    }

}

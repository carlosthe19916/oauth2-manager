package io.github.carlosthe19916;

import java.util.Optional;

public class TokenManager {

    private final String clientID;
    private final String tokenURL;

    private Optional<String> refreshToken;

    public TokenManager(String clientID, String tokenURL) {
        this.clientID = clientID;
        this.tokenURL = tokenURL;
    }

    public Optional<String> getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = Optional.of(refreshToken);
    }

}

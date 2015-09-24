package com.breadwallet.wallet;

import java.nio.ByteBuffer;
import java.text.NumberFormat;
import java.util.List;

/**
 * BreadWallet
 * <p/>
 * Created by Mihail on 9/22/15.
 * Copyright (c) 2015 Mihail Gutan <mihail@breadwallet.com>
 * <p/>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p/>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * <p/>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

public class BRWalletManager {
    public static final String TAG = BRWalletManager.class.getName();
    private static BRWalletManager instance;

    public static final long SATOSHIS = 100000000;
    public static final long MAX_MONEY = 21000000 * SATOSHIS;
    public static final long DEFAULT_FEE_PER_KB = 4096 * 1000 / 225; // fee required by eligius pool, which supports child-pays-for-parent
    public static final long MAX_FEE_PER_KB = 100100 * 1000 / 225; // slightly higher than a 1000bit fee on a typical 225byte transaction
    public static final String UNSPENT_URL_1 = "https://api.chain.com/v2/"; // + a string
    public static final String UNSPENT_URL_2 = "/addresses/"; // + a string
    public static final String UNSPENT_URL_3 = "/unspents?api-key-id=eed0d7697a880144bb854676f88d123f";
    public static final String TICKER_URL = "https://bitpay.com/rates";
    public static final String FEE_PER_KB_URL = "https://api.breadwallet.com/v1/fee-per-kb";
    public static final int SEED_ENTROPY_LENGTH = 128 / 8;
    public static final String SEC_ATTR_SERVICE = "org.voisine.breadwallet";

    ByteBuffer masterPublicKey; // master public key used to generate wallet addresses
    char[] seedPhrase;          // requesting seedPhrase will trigger authentication
    long seedCreationTime;      // interval since reference date, 00:00:00 01/01/01 GMT
    long secureTime;            // last known time from an ssl server connection
    long spendingLimit;         // amount that can be spent using touch id without pin entry
    boolean passcodeEnabled;    // true if device passcode is enabled
    boolean didAuthenticate;    // true if the user authenticated after this was last set to false
    NumberFormat format;        // bitcoin currency formatter
    NumberFormat localFormat;   // local currency formatter
    String localCurrencyCode;   // local currency ISO code
    double localCurrencyPrice;  // exchange rate in local currency units per bitcoin
    List<String> currencyCodes; // list of supported local currency codes
    List<String> currencyNames; // names for local currency codes

    private BRWalletManager() {
        /**
         * initialize the class
         */
    }

    public static synchronized BRWalletManager getInstance() {
        if (instance == null) {
            instance = new BRWalletManager();
        }
        return instance;
    }

    public BRWallet wallet() {
        return null;
    }

    public static boolean setKeychainData(ByteBuffer buffer, String key, boolean authenticated) {
        return false;
    }

    public static ByteBuffer getKeychainData(String key) {
        return null;
    }

    public static boolean setKeychainInt(long i, String key, boolean authenticated) {
        return false;
    }

    public static long getKeychainInt(String key) {
        return 0;
    }

    public static boolean setKeychainString(String s, String key, boolean authenticated) {
        return false;
    }

    public static String getKeychainString(String key) {
        return null;
    }

    /**
     * generates a random seed, saves to keychain and returns the associated seedPhrase
     */
    public String generateRandomSeed() {

        return null;
    }

    /**
     * authenticates user and returns seed
     */
    public ByteBuffer seedWithPrompt(String authPrompt, long amount) {
        return null;
    }

    /**
     * authenticates user and returns seedPhrase
     */
    public String seedPhraseWithPrompt(String authPrompt) {
        return null;
    }

    /**
     * prompts the user to set or change wallet pin and returns true if the pin was successfully set
     */
    public boolean setPin() {
        return false;
    }

    /**
     * queries chain.com and calls the completion block with unspent outputs for the given address
     */
    public void utxosForAddress(String address) {
        //?????????????????????????????
    }

    /**
     * given a private key, queries chain.com for unspent outputs and calls the completion block with
     * a signed transaction that will sweep the balance into wallet (doesn't publish the tx)
     */
    public void sweepPrivateKey(String privKey, boolean fee) {
        //?????????????????????????????
    }

    public long amountForString(String string) {
        return 0;
    }

    public String stringForAmount(long amount) {
        return null;
    }

    public long amountForLocalCurrencyString(String string) {
        return 0;
    }

    public String localCurrencyStringForAmount(long amount) {
        return null;
    }

    /**
     * true if keychain is available and we know that no wallet exists on it
     */
    public boolean noWallet() {
        return false;
    }

    /**
     * master public key used to generate wallet addresses
     */
    public ByteBuffer masterPublicKey() {
        return null;
    }

    /**
     * requesting seedPhrase will trigger authentication
     */
    public String seedPhrase() {
        return null;
    }

    public void setSeedPhrase(char[] seedPhrase) {

    }

    /**
     * interval since refrence date, 00:00:00 01/01/01 GMT
     */
    public long seedCreationTime() {
        return 0;
    }

    /**
     * true if device passcode is enabled
     */
    public boolean isPasscodeEnabled() {
        return false;
    }

    public void updateFeePerKb(){

    }

}
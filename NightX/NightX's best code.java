/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 *  org.apache.http.HttpEntity
 *  org.apache.http.client.methods.CloseableHttpResponse
 *  org.apache.http.client.methods.HttpGet
 *  org.apache.http.client.methods.HttpUriRequest
 *  org.apache.http.impl.client.CloseableHttpClient
 *  org.apache.http.impl.client.HttpClients
 *  org.apache.http.util.EntityUtils
 */
package net.aspw.client.util.connection;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class CheckConnection {
    public static final CheckConnection INSTANCE = new CheckConnection();
    private static String userList = "";
    private static String announcement = "";
    private static String discord = "";
    private static String apiKey = "";
    private static String changeLog1 = "";
    private static String changeLog2 = "";
    private static String changeLog3 = "";
    private static String changeLog4 = "";
    private static String changeLog5 = "";
    private static String changeLog6 = "";
    private static String changeLog7 = "";
    private static String changeLog8 = "";
    private static String changeLog9 = "";
    private static String changeLog10 = "";
    private static String changeLog11 = "";
    private static String changeLog12 = "";
    private static String changeLog13 = "";
    private static String changeLog14 = "";
    private static String changeLog15 = "";
    private static String changeLog16 = "";
    private static String changeLog17 = "";
    private static String changeLog18 = "";
    private static String changeLog19 = "";
    private static String changeLog20 = "";
    private static String changeLog21 = "";
    private static String changeLog22 = "";
    private static String changeLog23 = "";
    private static String changeLog24 = "";
    private static String changeLog25 = "";
    private static String changeLog26 = "";
    private static String changeLog27 = "";
    private static String changeLog28 = "";
    private static String changeLog29 = "";
    private static String changeLog30 = "";
    private static String changeLog31 = "";
    private static String changeLog32 = "";
    private static String changeLog33 = "";
    private static String changeLog34 = "";
    private static String changeLog35 = "";
    private static String changeLog36 = "";
    private static String changeLog37 = "";
    private static String changeLog38 = "";
    private static String changeLog39 = "";
    private static String changeLog40 = "";
    private static boolean isLatest;
    private static boolean isAvailable;

    private CheckConnection() {
    }

    public final String getUserList() {
        return userList;
    }

    public final void setUserList(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        userList = string;
    }

    public final String getAnnouncement() {
        return announcement;
    }

    public final void setAnnouncement(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        announcement = string;
    }

    public final String getDiscord() {
        return discord;
    }

    public final void setDiscord(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        discord = string;
    }

    public final String getApiKey() {
        return apiKey;
    }

    public final void setApiKey(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        apiKey = string;
    }

    public final String getChangeLog1() {
        return changeLog1;
    }

    public final void setChangeLog1(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog1 = string;
    }

    public final String getChangeLog2() {
        return changeLog2;
    }

    public final void setChangeLog2(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog2 = string;
    }

    public final String getChangeLog3() {
        return changeLog3;
    }

    public final void setChangeLog3(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog3 = string;
    }

    public final String getChangeLog4() {
        return changeLog4;
    }

    public final void setChangeLog4(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog4 = string;
    }

    public final String getChangeLog5() {
        return changeLog5;
    }

    public final void setChangeLog5(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog5 = string;
    }

    public final String getChangeLog6() {
        return changeLog6;
    }

    public final void setChangeLog6(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog6 = string;
    }

    public final String getChangeLog7() {
        return changeLog7;
    }

    public final void setChangeLog7(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog7 = string;
    }

    public final String getChangeLog8() {
        return changeLog8;
    }

    public final void setChangeLog8(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog8 = string;
    }

    public final String getChangeLog9() {
        return changeLog9;
    }

    public final void setChangeLog9(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog9 = string;
    }

    public final String getChangeLog10() {
        return changeLog10;
    }

    public final void setChangeLog10(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog10 = string;
    }

    public final String getChangeLog11() {
        return changeLog11;
    }

    public final void setChangeLog11(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog11 = string;
    }

    public final String getChangeLog12() {
        return changeLog12;
    }

    public final void setChangeLog12(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog12 = string;
    }

    public final String getChangeLog13() {
        return changeLog13;
    }

    public final void setChangeLog13(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog13 = string;
    }

    public final String getChangeLog14() {
        return changeLog14;
    }

    public final void setChangeLog14(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog14 = string;
    }

    public final String getChangeLog15() {
        return changeLog15;
    }

    public final void setChangeLog15(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog15 = string;
    }

    public final String getChangeLog16() {
        return changeLog16;
    }

    public final void setChangeLog16(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog16 = string;
    }

    public final String getChangeLog17() {
        return changeLog17;
    }

    public final void setChangeLog17(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog17 = string;
    }

    public final String getChangeLog18() {
        return changeLog18;
    }

    public final void setChangeLog18(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog18 = string;
    }

    public final String getChangeLog19() {
        return changeLog19;
    }

    public final void setChangeLog19(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog19 = string;
    }

    public final String getChangeLog20() {
        return changeLog20;
    }

    public final void setChangeLog20(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog20 = string;
    }

    public final String getChangeLog21() {
        return changeLog21;
    }

    public final void setChangeLog21(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog21 = string;
    }

    public final String getChangeLog22() {
        return changeLog22;
    }

    public final void setChangeLog22(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog22 = string;
    }

    public final String getChangeLog23() {
        return changeLog23;
    }

    public final void setChangeLog23(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog23 = string;
    }

    public final String getChangeLog24() {
        return changeLog24;
    }

    public final void setChangeLog24(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog24 = string;
    }

    public final String getChangeLog25() {
        return changeLog25;
    }

    public final void setChangeLog25(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog25 = string;
    }

    public final String getChangeLog26() {
        return changeLog26;
    }

    public final void setChangeLog26(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog26 = string;
    }

    public final String getChangeLog27() {
        return changeLog27;
    }

    public final void setChangeLog27(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog27 = string;
    }

    public final String getChangeLog28() {
        return changeLog28;
    }

    public final void setChangeLog28(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog28 = string;
    }

    public final String getChangeLog29() {
        return changeLog29;
    }

    public final void setChangeLog29(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog29 = string;
    }

    public final String getChangeLog30() {
        return changeLog30;
    }

    public final void setChangeLog30(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog30 = string;
    }

    public final String getChangeLog31() {
        return changeLog31;
    }

    public final void setChangeLog31(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog31 = string;
    }

    public final String getChangeLog32() {
        return changeLog32;
    }

    public final void setChangeLog32(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog32 = string;
    }

    public final String getChangeLog33() {
        return changeLog33;
    }

    public final void setChangeLog33(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog33 = string;
    }

    public final String getChangeLog34() {
        return changeLog34;
    }

    public final void setChangeLog34(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog34 = string;
    }

    public final String getChangeLog35() {
        return changeLog35;
    }

    public final void setChangeLog35(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog35 = string;
    }

    public final String getChangeLog36() {
        return changeLog36;
    }

    public final void setChangeLog36(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog36 = string;
    }

    public final String getChangeLog37() {
        return changeLog37;
    }

    public final void setChangeLog37(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog37 = string;
    }

    public final String getChangeLog38() {
        return changeLog38;
    }

    public final void setChangeLog38(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog38 = string;
    }

    public final String getChangeLog39() {
        return changeLog39;
    }

    public final void setChangeLog39(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog39 = string;
    }

    public final String getChangeLog40() {
        return changeLog40;
    }

    public final void setChangeLog40(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        changeLog40 = string;
    }

    public final boolean isLatest() {
        return isLatest;
    }

    public final void setLatest(boolean bl) {
        isLatest = bl;
    }

    public final boolean isAvailable() {
        return isAvailable;
    }

    public final void setAvailable(boolean bl) {
        isAvailable = bl;
    }

    public final void checkStatus() {
        CloseableHttpClient closeableHttpClient = HttpClients.createDefault();
        Intrinsics.checkNotNullExpressionValue((Object)closeableHttpClient, (String)"createDefault()");
        CloseableHttpClient httpClient = closeableHttpClient;
        HttpGet request = new HttpGet("https://nightx.skidded.host/s/kbc8oumsjt");
        CloseableHttpResponse response = httpClient.execute((HttpUriRequest)request);
        HttpEntity entity = response.getEntity();
        String content = EntityUtils.toString((HttpEntity)entity);
        EntityUtils.consume((HttpEntity)entity);
        response.close();
        httpClient.close();
        Intrinsics.checkNotNullExpressionValue((Object)content, (String)"content");
        String[] stringArray = new String[]{"~"};
        List details = StringsKt.split$default((CharSequence)content, (String[])stringArray, (boolean)false, (int)0, (int)6, null);
        announcement = (String)details.get(4);
        discord = (String)details.get(3);
        apiKey = (String)details.get(2);
        if (details.get(1).equals("Release B60")) {
            isLatest = true;
        }
        if (details.get(0).equals("True")) {
            isAvailable = true;
        }
        String[] stringArray2 = new String[]{"---"};
        List slashLog = StringsKt.split$default((CharSequence)((CharSequence)details.get(5)), (String[])stringArray2, (boolean)false, (int)0, (int)6, null);
        changeLog1 = (String)slashLog.get(0);
        changeLog2 = (String)slashLog.get(1);
        changeLog3 = (String)slashLog.get(2);
        changeLog4 = (String)slashLog.get(3);
        changeLog5 = (String)slashLog.get(4);
        changeLog6 = (String)slashLog.get(5);
        changeLog7 = (String)slashLog.get(6);
        changeLog8 = (String)slashLog.get(7);
        changeLog9 = (String)slashLog.get(8);
        changeLog10 = (String)slashLog.get(9);
        changeLog11 = (String)slashLog.get(10);
        changeLog12 = (String)slashLog.get(11);
        changeLog13 = (String)slashLog.get(12);
        changeLog14 = (String)slashLog.get(13);
        changeLog15 = (String)slashLog.get(14);
        changeLog16 = (String)slashLog.get(15);
        changeLog17 = (String)slashLog.get(16);
        changeLog18 = (String)slashLog.get(17);
        changeLog19 = (String)slashLog.get(18);
        changeLog20 = (String)slashLog.get(19);
        changeLog21 = (String)slashLog.get(20);
        changeLog22 = (String)slashLog.get(21);
        changeLog23 = (String)slashLog.get(22);
        changeLog24 = (String)slashLog.get(23);
        changeLog25 = (String)slashLog.get(24);
        changeLog26 = (String)slashLog.get(25);
        changeLog27 = (String)slashLog.get(26);
        changeLog28 = (String)slashLog.get(27);
        changeLog29 = (String)slashLog.get(28);
        changeLog30 = (String)slashLog.get(29);
        changeLog31 = (String)slashLog.get(30);
        changeLog32 = (String)slashLog.get(31);
        changeLog33 = (String)slashLog.get(32);
        changeLog34 = (String)slashLog.get(33);
        changeLog35 = (String)slashLog.get(34);
        changeLog36 = (String)slashLog.get(35);
        changeLog37 = (String)slashLog.get(36);
        changeLog38 = (String)slashLog.get(37);
        changeLog39 = (String)slashLog.get(38);
        changeLog40 = (String)slashLog.get(39);
    }

    public final void getUserList() {
        CloseableHttpClient closeableHttpClient = HttpClients.createDefault();
        Intrinsics.checkNotNullExpressionValue((Object)closeableHttpClient, (String)"createDefault()");
        CloseableHttpClient httpClient = closeableHttpClient;
        HttpGet request = new HttpGet("https://nightx.skidded.host/s/du1nu327um");
        CloseableHttpResponse response = httpClient.execute((HttpUriRequest)request);
        HttpEntity entity = response.getEntity();
        String content = EntityUtils.toString((HttpEntity)entity);
        EntityUtils.consume((HttpEntity)entity);
        response.close();
        httpClient.close();
        Intrinsics.checkNotNullExpressionValue((Object)content, (String)"content");
        userList = content;
    }
}


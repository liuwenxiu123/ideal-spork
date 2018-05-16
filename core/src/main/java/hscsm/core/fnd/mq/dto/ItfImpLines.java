//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package hscsm.core.fnd.mq.dto;

import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

@Table(
    name = "hscs_itf_imp_lines"
)
@ExtensionAttribute(
    disable = false
)
public class ItfImpLines extends BaseDTO {
    @Id
    @GeneratedValue
    private Long lineId;
    @NotNull
    private Long headerId;
    private Date processDate;
    @NotEmpty
    private String importStatus;
    private String processStatus;
    private Long processGroup;
    private String statementStatus;
    private Date statementDate;
    private String processMessage;
    private Long sourceIterfaceId;
    @Transient
    private String processMeaning;
    @Transient
    private String importMeaning;
    @Transient
    private List<String> fieldNameList;
    @Transient
    private List<String> fieldValueList;
    @Transient
    private String columnNameList;
    @Transient
    private String columnName;
    @Transient
    private String columnValue;
    @Transient
    private String disableFlag;
    @Transient
    private List<Long> lineIdList;
    @Transient
    private List<Long> headerIdList;
    @Transient
    private Map<String, String> mappingValues;
    private String value1;
    private String value2;
    private String value3;
    private String value4;
    private String value5;
    private String value6;
    private String value7;
    private String value8;
    private String value9;
    private String value10;
    private String value11;
    private String value12;
    private String value13;
    private String value14;
    private String value15;
    private String value16;
    private String value17;
    private String value18;
    private String value19;
    private String value20;
    private String value21;
    private String value22;
    private String value23;
    private String value24;
    private String value25;
    private String value26;
    private String value27;
    private String value28;
    private String value29;
    private String value30;
    private String value31;
    private String value32;
    private String value33;
    private String value34;
    private String value35;
    private String value36;
    private String value37;
    private String value38;
    private String value39;
    private String value40;
    private String value41;
    private String value42;
    private String value43;
    private String value44;
    private String value45;
    private String value46;
    private String value47;
    private String value48;
    private String value49;
    private String value50;
    private String value51;
    private String value52;
    private String value53;
    private String value54;
    private String value55;
    private String value56;
    private String value57;
    private String value58;
    private String value59;
    private String value60;
    private String value61;
    private String value62;
    private String value63;
    private String value64;
    private String value65;
    private String value66;
    private String value67;
    private String value68;
    private String value69;
    private String value70;
    private String value71;
    private String value72;
    private String value73;
    private String value74;
    private String value75;
    private String value76;
    private String value77;
    private String value78;
    private String value79;
    private String value80;
    private String value81;
    private String value82;
    private String value83;
    private String value84;
    private String value85;
    private String value86;
    private String value87;
    private String value88;
    private String value89;
    private String value90;
    private String value91;
    private String value92;
    private String value93;
    private String value94;
    private String value95;
    private String value96;
    private String value97;
    private String value98;
    private String value99;
    private String value100;
    private String value101;
    private String value102;
    private String value103;
    private String value104;
    private String value105;
    private String value106;
    private String value107;
    private String value108;
    private String value109;
    private String value110;
    private String value111;
    private String value112;
    private String value113;
    private String value114;
    private String value115;
    private String value116;
    private String value117;
    private String value118;
    private String value119;
    private String value120;
    private String value121;
    private String value122;
    private String value123;
    private String value124;
    private String value125;
    private String value126;
    private String value127;
    private String value128;
    private String value129;
    private String value130;
    private String value131;
    private String value132;
    private String value133;
    private String value134;
    private String value135;
    private String value136;
    private String value137;
    private String value138;
    private String value139;
    private String value140;
    private String value141;
    private String value142;
    private String value143;
    private String value144;
    private String value145;
    private String value146;
    private String value147;
    private String value148;
    private String value149;
    private String value150;
    private String value151;
    private String value152;
    private String value153;
    private String value154;
    private String value155;
    private String value156;
    private String value157;
    private String value158;
    private String value159;
    private String value160;
    private String value161;
    private String value162;
    private String value163;
    private String value164;
    private String value165;
    private String value166;
    private String value167;
    private String value168;
    private String value169;
    private String value170;
    private String value171;
    private String value172;
    private String value173;
    private String value174;
    private String value175;
    private String value176;
    private String value177;
    private String value178;
    private String value179;
    private String value180;
    private String value181;
    private String value182;
    private String value183;
    private String value184;
    private String value185;
    private String value186;
    private String value187;
    private String value188;
    private String value189;
    private String value190;
    private String value191;
    private String value192;
    private String value193;
    private String value194;
    private String value195;
    private String value196;
    private String value197;
    private String value198;
    private String value199;
    private String value200;
    private Long programId;
    private Long requestId;
    @Transient
    private String batchNum;
    @Transient
    private String sourceSystemCode;
    @Transient
    private String interfaceName;
    @Transient
    private String moduleCode;

    public ItfImpLines() {
    }

    public String getDisableFlag() {
        return this.disableFlag;
    }

    public void setDisableFlag(String disableFlag) {
        this.disableFlag = disableFlag;
    }

    public String getBatchNum() {
        return this.batchNum;
    }

    public void setBatchNum(String batchNum) {
        this.batchNum = batchNum;
    }

    public String getSourceSystemCode() {
        return this.sourceSystemCode;
    }

    public void setSourceSystemCode(String sourceSystemCode) {
        this.sourceSystemCode = sourceSystemCode;
    }

    public String getInterfaceName() {
        return this.interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getModuleCode() {
        return this.moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public Long getSourceIterfaceId() {
        return this.sourceIterfaceId;
    }

    public void setSourceIterfaceId(Long sourceIterfaceId) {
        this.sourceIterfaceId = sourceIterfaceId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    public Long getLineId() {
        return this.lineId;
    }

    public void setHeaderId(Long headerId) {
        this.headerId = headerId;
    }

    public Long getHeaderId() {
        return this.headerId;
    }

    public void setProcessDate(Date processDate) {
        this.processDate = processDate;
    }

    public Date getProcessDate() {
        return this.processDate;
    }

    public void setImportStatus(String importStatus) {
        this.importStatus = importStatus;
    }

    public String getImportStatus() {
        return this.importStatus;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
    }

    public String getProcessStatus() {
        return this.processStatus;
    }

    public void setProcessGroup(Long processGroup) {
        this.processGroup = processGroup;
    }

    public Long getProcessGroup() {
        return this.processGroup;
    }

    public void setStatementStatus(String statementStatus) {
        this.statementStatus = statementStatus;
    }

    public String getStatementStatus() {
        return this.statementStatus;
    }

    public void setStatementDate(Date statementDate) {
        this.statementDate = statementDate;
    }

    public Date getStatementDate() {
        return this.statementDate;
    }

    public void setProcessMessage(String processMessage) {
        this.processMessage = processMessage;
    }

    public String getProcessMessage() {
        return this.processMessage;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue1() {
        return this.value1;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String getValue2() {
        return this.value2;
    }

    public void setValue3(String value3) {
        this.value3 = value3;
    }

    public String getValue3() {
        return this.value3;
    }

    public void setValue4(String value4) {
        this.value4 = value4;
    }

    public String getValue4() {
        return this.value4;
    }

    public void setValue5(String value5) {
        this.value5 = value5;
    }

    public String getValue5() {
        return this.value5;
    }

    public void setValue6(String value6) {
        this.value6 = value6;
    }

    public String getValue6() {
        return this.value6;
    }

    public void setValue7(String value7) {
        this.value7 = value7;
    }

    public String getValue7() {
        return this.value7;
    }

    public void setValue8(String value8) {
        this.value8 = value8;
    }

    public String getValue8() {
        return this.value8;
    }

    public void setValue9(String value9) {
        this.value9 = value9;
    }

    public String getValue9() {
        return this.value9;
    }

    public void setValue10(String value10) {
        this.value10 = value10;
    }

    public String getValue10() {
        return this.value10;
    }

    public void setValue11(String value11) {
        this.value11 = value11;
    }

    public String getValue11() {
        return this.value11;
    }

    public void setValue12(String value12) {
        this.value12 = value12;
    }

    public String getValue12() {
        return this.value12;
    }

    public void setValue13(String value13) {
        this.value13 = value13;
    }

    public String getValue13() {
        return this.value13;
    }

    public void setValue14(String value14) {
        this.value14 = value14;
    }

    public String getValue14() {
        return this.value14;
    }

    public void setValue15(String value15) {
        this.value15 = value15;
    }

    public String getValue15() {
        return this.value15;
    }

    public void setValue16(String value16) {
        this.value16 = value16;
    }

    public String getValue16() {
        return this.value16;
    }

    public void setValue17(String value17) {
        this.value17 = value17;
    }

    public String getValue17() {
        return this.value17;
    }

    public void setValue18(String value18) {
        this.value18 = value18;
    }

    public String getValue18() {
        return this.value18;
    }

    public void setValue19(String value19) {
        this.value19 = value19;
    }

    public String getValue19() {
        return this.value19;
    }

    public void setValue20(String value20) {
        this.value20 = value20;
    }

    public String getValue20() {
        return this.value20;
    }

    public void setValue21(String value21) {
        this.value21 = value21;
    }

    public String getValue21() {
        return this.value21;
    }

    public void setValue22(String value22) {
        this.value22 = value22;
    }

    public String getValue22() {
        return this.value22;
    }

    public void setValue23(String value23) {
        this.value23 = value23;
    }

    public String getValue23() {
        return this.value23;
    }

    public void setValue24(String value24) {
        this.value24 = value24;
    }

    public String getValue24() {
        return this.value24;
    }

    public void setValue25(String value25) {
        this.value25 = value25;
    }

    public String getValue25() {
        return this.value25;
    }

    public void setValue26(String value26) {
        this.value26 = value26;
    }

    public String getValue26() {
        return this.value26;
    }

    public void setValue27(String value27) {
        this.value27 = value27;
    }

    public String getValue27() {
        return this.value27;
    }

    public void setValue28(String value28) {
        this.value28 = value28;
    }

    public String getValue28() {
        return this.value28;
    }

    public void setValue29(String value29) {
        this.value29 = value29;
    }

    public String getValue29() {
        return this.value29;
    }

    public void setValue30(String value30) {
        this.value30 = value30;
    }

    public String getValue30() {
        return this.value30;
    }

    public void setValue31(String value31) {
        this.value31 = value31;
    }

    public String getValue31() {
        return this.value31;
    }

    public void setValue32(String value32) {
        this.value32 = value32;
    }

    public String getValue32() {
        return this.value32;
    }

    public void setValue33(String value33) {
        this.value33 = value33;
    }

    public String getValue33() {
        return this.value33;
    }

    public void setValue34(String value34) {
        this.value34 = value34;
    }

    public String getValue34() {
        return this.value34;
    }

    public void setValue35(String value35) {
        this.value35 = value35;
    }

    public String getValue35() {
        return this.value35;
    }

    public void setValue36(String value36) {
        this.value36 = value36;
    }

    public String getValue36() {
        return this.value36;
    }

    public void setValue37(String value37) {
        this.value37 = value37;
    }

    public String getValue37() {
        return this.value37;
    }

    public void setValue38(String value38) {
        this.value38 = value38;
    }

    public String getValue38() {
        return this.value38;
    }

    public void setValue39(String value39) {
        this.value39 = value39;
    }

    public String getValue39() {
        return this.value39;
    }

    public void setValue40(String value40) {
        this.value40 = value40;
    }

    public String getValue40() {
        return this.value40;
    }

    public void setValue41(String value41) {
        this.value41 = value41;
    }

    public String getValue41() {
        return this.value41;
    }

    public void setValue42(String value42) {
        this.value42 = value42;
    }

    public String getValue42() {
        return this.value42;
    }

    public void setValue43(String value43) {
        this.value43 = value43;
    }

    public String getValue43() {
        return this.value43;
    }

    public void setValue44(String value44) {
        this.value44 = value44;
    }

    public String getValue44() {
        return this.value44;
    }

    public void setValue45(String value45) {
        this.value45 = value45;
    }

    public String getValue45() {
        return this.value45;
    }

    public void setValue46(String value46) {
        this.value46 = value46;
    }

    public String getValue46() {
        return this.value46;
    }

    public void setValue47(String value47) {
        this.value47 = value47;
    }

    public String getValue47() {
        return this.value47;
    }

    public void setValue48(String value48) {
        this.value48 = value48;
    }

    public String getValue48() {
        return this.value48;
    }

    public void setValue49(String value49) {
        this.value49 = value49;
    }

    public String getValue49() {
        return this.value49;
    }

    public void setValue50(String value50) {
        this.value50 = value50;
    }

    public String getValue50() {
        return this.value50;
    }

    public void setValue51(String value51) {
        this.value51 = value51;
    }

    public String getValue51() {
        return this.value51;
    }

    public void setValue52(String value52) {
        this.value52 = value52;
    }

    public String getValue52() {
        return this.value52;
    }

    public void setValue53(String value53) {
        this.value53 = value53;
    }

    public String getValue53() {
        return this.value53;
    }

    public void setValue54(String value54) {
        this.value54 = value54;
    }

    public String getValue54() {
        return this.value54;
    }

    public void setValue55(String value55) {
        this.value55 = value55;
    }

    public String getValue55() {
        return this.value55;
    }

    public void setValue56(String value56) {
        this.value56 = value56;
    }

    public String getValue56() {
        return this.value56;
    }

    public void setValue57(String value57) {
        this.value57 = value57;
    }

    public String getValue57() {
        return this.value57;
    }

    public void setValue58(String value58) {
        this.value58 = value58;
    }

    public String getValue58() {
        return this.value58;
    }

    public void setValue59(String value59) {
        this.value59 = value59;
    }

    public String getValue59() {
        return this.value59;
    }

    public void setValue60(String value60) {
        this.value60 = value60;
    }

    public String getValue60() {
        return this.value60;
    }

    public void setValue61(String value61) {
        this.value61 = value61;
    }

    public String getValue61() {
        return this.value61;
    }

    public void setValue62(String value62) {
        this.value62 = value62;
    }

    public String getValue62() {
        return this.value62;
    }

    public void setValue63(String value63) {
        this.value63 = value63;
    }

    public String getValue63() {
        return this.value63;
    }

    public void setValue64(String value64) {
        this.value64 = value64;
    }

    public String getValue64() {
        return this.value64;
    }

    public void setValue65(String value65) {
        this.value65 = value65;
    }

    public String getValue65() {
        return this.value65;
    }

    public void setValue66(String value66) {
        this.value66 = value66;
    }

    public String getValue66() {
        return this.value66;
    }

    public void setValue67(String value67) {
        this.value67 = value67;
    }

    public String getValue67() {
        return this.value67;
    }

    public void setValue68(String value68) {
        this.value68 = value68;
    }

    public String getValue68() {
        return this.value68;
    }

    public void setValue69(String value69) {
        this.value69 = value69;
    }

    public String getValue69() {
        return this.value69;
    }

    public void setValue70(String value70) {
        this.value70 = value70;
    }

    public String getValue70() {
        return this.value70;
    }

    public void setValue71(String value71) {
        this.value71 = value71;
    }

    public String getValue71() {
        return this.value71;
    }

    public void setValue72(String value72) {
        this.value72 = value72;
    }

    public String getValue72() {
        return this.value72;
    }

    public void setValue73(String value73) {
        this.value73 = value73;
    }

    public String getValue73() {
        return this.value73;
    }

    public void setValue74(String value74) {
        this.value74 = value74;
    }

    public String getValue74() {
        return this.value74;
    }

    public void setValue75(String value75) {
        this.value75 = value75;
    }

    public String getValue75() {
        return this.value75;
    }

    public void setValue76(String value76) {
        this.value76 = value76;
    }

    public String getValue76() {
        return this.value76;
    }

    public void setValue77(String value77) {
        this.value77 = value77;
    }

    public String getValue77() {
        return this.value77;
    }

    public void setValue78(String value78) {
        this.value78 = value78;
    }

    public String getValue78() {
        return this.value78;
    }

    public void setValue79(String value79) {
        this.value79 = value79;
    }

    public String getValue79() {
        return this.value79;
    }

    public void setValue80(String value80) {
        this.value80 = value80;
    }

    public String getValue80() {
        return this.value80;
    }

    public void setValue81(String value81) {
        this.value81 = value81;
    }

    public String getValue81() {
        return this.value81;
    }

    public void setValue82(String value82) {
        this.value82 = value82;
    }

    public String getValue82() {
        return this.value82;
    }

    public void setValue83(String value83) {
        this.value83 = value83;
    }

    public String getValue83() {
        return this.value83;
    }

    public void setValue84(String value84) {
        this.value84 = value84;
    }

    public String getValue84() {
        return this.value84;
    }

    public void setValue85(String value85) {
        this.value85 = value85;
    }

    public String getValue85() {
        return this.value85;
    }

    public void setValue86(String value86) {
        this.value86 = value86;
    }

    public String getValue86() {
        return this.value86;
    }

    public void setValue87(String value87) {
        this.value87 = value87;
    }

    public String getValue87() {
        return this.value87;
    }

    public void setValue88(String value88) {
        this.value88 = value88;
    }

    public String getValue88() {
        return this.value88;
    }

    public void setValue89(String value89) {
        this.value89 = value89;
    }

    public String getValue89() {
        return this.value89;
    }

    public void setValue90(String value90) {
        this.value90 = value90;
    }

    public String getValue90() {
        return this.value90;
    }

    public void setValue91(String value91) {
        this.value91 = value91;
    }

    public String getValue91() {
        return this.value91;
    }

    public void setValue92(String value92) {
        this.value92 = value92;
    }

    public String getValue92() {
        return this.value92;
    }

    public void setValue93(String value93) {
        this.value93 = value93;
    }

    public String getValue93() {
        return this.value93;
    }

    public void setValue94(String value94) {
        this.value94 = value94;
    }

    public String getValue94() {
        return this.value94;
    }

    public void setValue95(String value95) {
        this.value95 = value95;
    }

    public String getValue95() {
        return this.value95;
    }

    public void setValue96(String value96) {
        this.value96 = value96;
    }

    public String getValue96() {
        return this.value96;
    }

    public void setValue97(String value97) {
        this.value97 = value97;
    }

    public String getValue97() {
        return this.value97;
    }

    public void setValue98(String value98) {
        this.value98 = value98;
    }

    public String getValue98() {
        return this.value98;
    }

    public void setValue99(String value99) {
        this.value99 = value99;
    }

    public String getValue99() {
        return this.value99;
    }

    public void setValue100(String value100) {
        this.value100 = value100;
    }

    public String getValue100() {
        return this.value100;
    }

    public void setValue101(String value101) {
        this.value101 = value101;
    }

    public String getValue101() {
        return this.value101;
    }

    public void setValue102(String value102) {
        this.value102 = value102;
    }

    public String getValue102() {
        return this.value102;
    }

    public void setValue103(String value103) {
        this.value103 = value103;
    }

    public String getValue103() {
        return this.value103;
    }

    public void setValue104(String value104) {
        this.value104 = value104;
    }

    public String getValue104() {
        return this.value104;
    }

    public void setValue105(String value105) {
        this.value105 = value105;
    }

    public String getValue105() {
        return this.value105;
    }

    public void setValue106(String value106) {
        this.value106 = value106;
    }

    public String getValue106() {
        return this.value106;
    }

    public void setValue107(String value107) {
        this.value107 = value107;
    }

    public String getValue107() {
        return this.value107;
    }

    public void setValue108(String value108) {
        this.value108 = value108;
    }

    public String getValue108() {
        return this.value108;
    }

    public void setValue109(String value109) {
        this.value109 = value109;
    }

    public String getValue109() {
        return this.value109;
    }

    public void setValue110(String value110) {
        this.value110 = value110;
    }

    public String getValue110() {
        return this.value110;
    }

    public void setValue111(String value111) {
        this.value111 = value111;
    }

    public String getValue111() {
        return this.value111;
    }

    public void setValue112(String value112) {
        this.value112 = value112;
    }

    public String getValue112() {
        return this.value112;
    }

    public void setValue113(String value113) {
        this.value113 = value113;
    }

    public String getValue113() {
        return this.value113;
    }

    public void setValue114(String value114) {
        this.value114 = value114;
    }

    public String getValue114() {
        return this.value114;
    }

    public void setValue115(String value115) {
        this.value115 = value115;
    }

    public String getValue115() {
        return this.value115;
    }

    public void setValue116(String value116) {
        this.value116 = value116;
    }

    public String getValue116() {
        return this.value116;
    }

    public void setValue117(String value117) {
        this.value117 = value117;
    }

    public String getValue117() {
        return this.value117;
    }

    public void setValue118(String value118) {
        this.value118 = value118;
    }

    public String getValue118() {
        return this.value118;
    }

    public void setValue119(String value119) {
        this.value119 = value119;
    }

    public String getValue119() {
        return this.value119;
    }

    public void setValue120(String value120) {
        this.value120 = value120;
    }

    public String getValue120() {
        return this.value120;
    }

    public void setValue121(String value121) {
        this.value121 = value121;
    }

    public String getValue121() {
        return this.value121;
    }

    public void setValue122(String value122) {
        this.value122 = value122;
    }

    public String getValue122() {
        return this.value122;
    }

    public void setValue123(String value123) {
        this.value123 = value123;
    }

    public String getValue123() {
        return this.value123;
    }

    public void setValue124(String value124) {
        this.value124 = value124;
    }

    public String getValue124() {
        return this.value124;
    }

    public void setValue125(String value125) {
        this.value125 = value125;
    }

    public String getValue125() {
        return this.value125;
    }

    public void setValue126(String value126) {
        this.value126 = value126;
    }

    public String getValue126() {
        return this.value126;
    }

    public void setValue127(String value127) {
        this.value127 = value127;
    }

    public String getValue127() {
        return this.value127;
    }

    public void setValue128(String value128) {
        this.value128 = value128;
    }

    public String getValue128() {
        return this.value128;
    }

    public void setValue129(String value129) {
        this.value129 = value129;
    }

    public String getValue129() {
        return this.value129;
    }

    public void setValue130(String value130) {
        this.value130 = value130;
    }

    public String getValue130() {
        return this.value130;
    }

    public void setValue131(String value131) {
        this.value131 = value131;
    }

    public String getValue131() {
        return this.value131;
    }

    public void setValue132(String value132) {
        this.value132 = value132;
    }

    public String getValue132() {
        return this.value132;
    }

    public void setValue133(String value133) {
        this.value133 = value133;
    }

    public String getValue133() {
        return this.value133;
    }

    public void setValue134(String value134) {
        this.value134 = value134;
    }

    public String getValue134() {
        return this.value134;
    }

    public void setValue135(String value135) {
        this.value135 = value135;
    }

    public String getValue135() {
        return this.value135;
    }

    public void setValue136(String value136) {
        this.value136 = value136;
    }

    public String getValue136() {
        return this.value136;
    }

    public void setValue137(String value137) {
        this.value137 = value137;
    }

    public String getValue137() {
        return this.value137;
    }

    public void setValue138(String value138) {
        this.value138 = value138;
    }

    public String getValue138() {
        return this.value138;
    }

    public void setValue139(String value139) {
        this.value139 = value139;
    }

    public String getValue139() {
        return this.value139;
    }

    public void setValue140(String value140) {
        this.value140 = value140;
    }

    public String getValue140() {
        return this.value140;
    }

    public void setValue141(String value141) {
        this.value141 = value141;
    }

    public String getValue141() {
        return this.value141;
    }

    public void setValue142(String value142) {
        this.value142 = value142;
    }

    public String getValue142() {
        return this.value142;
    }

    public void setValue143(String value143) {
        this.value143 = value143;
    }

    public String getValue143() {
        return this.value143;
    }

    public void setValue144(String value144) {
        this.value144 = value144;
    }

    public String getValue144() {
        return this.value144;
    }

    public void setValue145(String value145) {
        this.value145 = value145;
    }

    public String getValue145() {
        return this.value145;
    }

    public void setValue146(String value146) {
        this.value146 = value146;
    }

    public String getValue146() {
        return this.value146;
    }

    public void setValue147(String value147) {
        this.value147 = value147;
    }

    public String getValue147() {
        return this.value147;
    }

    public void setValue148(String value148) {
        this.value148 = value148;
    }

    public String getValue148() {
        return this.value148;
    }

    public void setValue149(String value149) {
        this.value149 = value149;
    }

    public String getValue149() {
        return this.value149;
    }

    public void setValue150(String value150) {
        this.value150 = value150;
    }

    public String getValue150() {
        return this.value150;
    }

    public void setValue151(String value151) {
        this.value151 = value151;
    }

    public String getValue151() {
        return this.value151;
    }

    public void setValue152(String value152) {
        this.value152 = value152;
    }

    public String getValue152() {
        return this.value152;
    }

    public void setValue153(String value153) {
        this.value153 = value153;
    }

    public String getValue153() {
        return this.value153;
    }

    public void setValue154(String value154) {
        this.value154 = value154;
    }

    public String getValue154() {
        return this.value154;
    }

    public void setValue155(String value155) {
        this.value155 = value155;
    }

    public String getValue155() {
        return this.value155;
    }

    public void setValue156(String value156) {
        this.value156 = value156;
    }

    public String getValue156() {
        return this.value156;
    }

    public void setValue157(String value157) {
        this.value157 = value157;
    }

    public String getValue157() {
        return this.value157;
    }

    public void setValue158(String value158) {
        this.value158 = value158;
    }

    public String getValue158() {
        return this.value158;
    }

    public void setValue159(String value159) {
        this.value159 = value159;
    }

    public String getValue159() {
        return this.value159;
    }

    public void setValue160(String value160) {
        this.value160 = value160;
    }

    public String getValue160() {
        return this.value160;
    }

    public void setValue161(String value161) {
        this.value161 = value161;
    }

    public String getValue161() {
        return this.value161;
    }

    public void setValue162(String value162) {
        this.value162 = value162;
    }

    public String getValue162() {
        return this.value162;
    }

    public void setValue163(String value163) {
        this.value163 = value163;
    }

    public String getValue163() {
        return this.value163;
    }

    public void setValue164(String value164) {
        this.value164 = value164;
    }

    public String getValue164() {
        return this.value164;
    }

    public void setValue165(String value165) {
        this.value165 = value165;
    }

    public String getValue165() {
        return this.value165;
    }

    public void setValue166(String value166) {
        this.value166 = value166;
    }

    public String getValue166() {
        return this.value166;
    }

    public void setValue167(String value167) {
        this.value167 = value167;
    }

    public String getValue167() {
        return this.value167;
    }

    public void setValue168(String value168) {
        this.value168 = value168;
    }

    public String getValue168() {
        return this.value168;
    }

    public void setValue169(String value169) {
        this.value169 = value169;
    }

    public String getValue169() {
        return this.value169;
    }

    public void setValue170(String value170) {
        this.value170 = value170;
    }

    public String getValue170() {
        return this.value170;
    }

    public void setValue171(String value171) {
        this.value171 = value171;
    }

    public String getValue171() {
        return this.value171;
    }

    public void setValue172(String value172) {
        this.value172 = value172;
    }

    public String getValue172() {
        return this.value172;
    }

    public void setValue173(String value173) {
        this.value173 = value173;
    }

    public String getValue173() {
        return this.value173;
    }

    public void setValue174(String value174) {
        this.value174 = value174;
    }

    public String getValue174() {
        return this.value174;
    }

    public void setValue175(String value175) {
        this.value175 = value175;
    }

    public String getValue175() {
        return this.value175;
    }

    public void setValue176(String value176) {
        this.value176 = value176;
    }

    public String getValue176() {
        return this.value176;
    }

    public void setValue177(String value177) {
        this.value177 = value177;
    }

    public String getValue177() {
        return this.value177;
    }

    public void setValue178(String value178) {
        this.value178 = value178;
    }

    public String getValue178() {
        return this.value178;
    }

    public void setValue179(String value179) {
        this.value179 = value179;
    }

    public String getValue179() {
        return this.value179;
    }

    public void setValue180(String value180) {
        this.value180 = value180;
    }

    public String getValue180() {
        return this.value180;
    }

    public void setValue181(String value181) {
        this.value181 = value181;
    }

    public String getValue181() {
        return this.value181;
    }

    public void setValue182(String value182) {
        this.value182 = value182;
    }

    public String getValue182() {
        return this.value182;
    }

    public void setValue183(String value183) {
        this.value183 = value183;
    }

    public String getValue183() {
        return this.value183;
    }

    public void setValue184(String value184) {
        this.value184 = value184;
    }

    public String getValue184() {
        return this.value184;
    }

    public void setValue185(String value185) {
        this.value185 = value185;
    }

    public String getValue185() {
        return this.value185;
    }

    public void setValue186(String value186) {
        this.value186 = value186;
    }

    public String getValue186() {
        return this.value186;
    }

    public void setValue187(String value187) {
        this.value187 = value187;
    }

    public String getValue187() {
        return this.value187;
    }

    public void setValue188(String value188) {
        this.value188 = value188;
    }

    public String getValue188() {
        return this.value188;
    }

    public void setValue189(String value189) {
        this.value189 = value189;
    }

    public String getValue189() {
        return this.value189;
    }

    public void setValue190(String value190) {
        this.value190 = value190;
    }

    public String getValue190() {
        return this.value190;
    }

    public void setValue191(String value191) {
        this.value191 = value191;
    }

    public String getValue191() {
        return this.value191;
    }

    public void setValue192(String value192) {
        this.value192 = value192;
    }

    public String getValue192() {
        return this.value192;
    }

    public void setValue193(String value193) {
        this.value193 = value193;
    }

    public String getValue193() {
        return this.value193;
    }

    public void setValue194(String value194) {
        this.value194 = value194;
    }

    public String getValue194() {
        return this.value194;
    }

    public void setValue195(String value195) {
        this.value195 = value195;
    }

    public String getValue195() {
        return this.value195;
    }

    public void setValue196(String value196) {
        this.value196 = value196;
    }

    public String getValue196() {
        return this.value196;
    }

    public void setValue197(String value197) {
        this.value197 = value197;
    }

    public String getValue197() {
        return this.value197;
    }

    public void setValue198(String value198) {
        this.value198 = value198;
    }

    public String getValue198() {
        return this.value198;
    }

    public void setValue199(String value199) {
        this.value199 = value199;
    }

    public String getValue199() {
        return this.value199;
    }

    public void setValue200(String value200) {
        this.value200 = value200;
    }

    public String getValue200() {
        return this.value200;
    }

    public void setProgramId(Long programId) {
        this.programId = programId;
    }

    public Long getProgramId() {
        return this.programId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public Long getRequestId() {
        return this.requestId;
    }

    public List<String> getFieldNameList() {
        return this.fieldNameList;
    }

    public void setFieldNameList(List<String> fieldNameList) {
        this.fieldNameList = fieldNameList;
    }

    public List<String> getFieldValueList() {
        return this.fieldValueList;
    }

    public void setFieldValueList(List<String> fieldValueList) {
        this.fieldValueList = fieldValueList;
    }

    public String getColumnNameList() {
        return this.columnNameList;
    }

    public void setColumnNameList(String columnNameList) {
        this.columnNameList = columnNameList;
    }

    public String getColumnName() {
        return this.columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnValue() {
        return this.columnValue;
    }

    public void setColumnValue(String columnValue) {
        this.columnValue = columnValue;
    }

    public List<Long> getLineIdList() {
        return this.lineIdList;
    }

    public void setLineIdList(List<Long> lineIdList) {
        this.lineIdList = lineIdList;
    }

    public List<Long> getHeaderIdList() {
        return this.headerIdList;
    }

    public void setHeaderIdList(List<Long> headerIdList) {
        this.headerIdList = headerIdList;
    }

    public String getProcessMeaning() {
        return this.processMeaning;
    }

    public void setProcessMeaning(String processMeaning) {
        this.processMeaning = processMeaning;
    }

    public String getImportMeaning() {
        return this.importMeaning;
    }

    public void setImportMeaning(String importMeaning) {
        this.importMeaning = importMeaning;
    }

    public Map<String, String> getMappingValues() {
        return this.mappingValues;
    }

    public void setMappingValues(Map<String, String> mappingValues) {
        this.mappingValues = mappingValues;
    }
}

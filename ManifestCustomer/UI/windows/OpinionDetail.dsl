<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="OpinionDetail" controller="OpinionDetailController" namespace="com.lionbridge.customer">
    <import ref="OpinionDetail.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <div id="viewPage0">
        <navigatorbar id="navigatorbar0" title="意见反馈" class="navigatorbarclass">
            <input id="imagebutton0" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" onclick="this.closeOpinionDetail()" type="imagebutton" checked="false"/>
            <label id="label1"/>
            <input id="button0" value="反馈" class="textbtnclass" type="button"/> 
        </navigatorbar>
        <label id="label0"/>
        <listView id="listviewdefine0">
            <div id="panel0">
                <label id="label2" bindfield="opinionDesc" type="multiline">内容</label>
                <label id="label3" bindfield="opinionTime">2015-05月-29 15:31:00</label> 
            </div> 
        </listView> 
    </div> 
</window>

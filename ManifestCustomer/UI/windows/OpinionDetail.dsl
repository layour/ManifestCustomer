<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="OpinionDetail" controller="OpinionDetailController" namespace="com.lionbridge.customer">
    <import ref="OpinionDetail.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <div id="viewPage0">
        <navigatorbar id="navigatorbar0" title="意见反馈" class="navigatorbarclass">
            <input id="imagebutton0" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" onclick="this.closeOpinionDetail()" type="imagebutton" checked="false"/> 
        </navigatorbar>
        <label id="label0"/>
        <listView id="listviewdefine0" bindfield="list" onload="this.loadOpinionDetail()">
            <div id="panel0">
                <div id="panel1">
                    <label id="label2" bindfield="opinionDesc" type="multiline">我：内容</label>
                    <label id="label3" bindfield="opinionTime">2015-05月-29 15:31:00</label> 
                </div> 
            </div>
            <div id="panel2">
                <div id="panel3">
                    <label id="label4" bindfield="opinionDesc" type="multiline">客服：内容</label>
                    <label id="label5" bindfield="opinionTime">2015-05月-29 15:31:00</label> 
                </div> 
            </div> 
        </listView>
        <label id="label1"/>
        <div id="panel4">
            <input id="textbox0" maxlength="256" placeholder="请输入反馈内容" type="text"/>
            <input id="button1" value="反馈" class="buttonclass loginbuttonclass" type="button"/> 
        </div> 
    </div> 
</window>

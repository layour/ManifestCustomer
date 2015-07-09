<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="OrderList" controller="OrderListController" namespace="com.lionbridge.customer">
    <import ref="OrderList.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <div id="viewPage0">
        <navigatorbar id="navigatorbar0" title="一键下单" class="navigatorbarclass">
            <input id="imagebutton0" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" onclick="this.closeOrderList()" type="imagebutton" checked="false"/> 
        </navigatorbar>
        <label id="label0"/>
        <div id="panel0">
            <input id="button0" value="北京市" class="textbtnclass" type="button"/>
            <input id="imagebutton1" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
            <input id="button2" value="上海市" class="textbtnclass" type="button"/> 
        </div>
        <listView id="listviewdefine0" bindfield="list" onload="this.loadOrder()" onitemclick="this.openOneKeyOrder()">
            <div id="panel1">
                <div id="panel2">
                    <div id="panel4">
                        <label id="label5">到场时间</label>
                        <label id="label9" bindfield="time">8:00 -- 18:00</label>
                        <label id="label4" bindfield="line">北京及周边 - 上海及周边BS01</label>
                        <label id="label1" bindfield="date">2015-07-08</label> 
                    </div>
                    <div id="panel3">
                        <label id="label7" bindfield="count">3厢</label>
                        <label id="label2"/>
                        <label id="label3" bindfield="money">￥9400</label> 
                    </div> 
                </div> 
            </div> 
        </listView> 
    </div> 
</window>

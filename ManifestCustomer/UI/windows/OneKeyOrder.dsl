<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="OneKeyOrder" controller="OneKeyOrderController" namespace="com.lionbridge.customer">
    <import ref="OneKeyOrder.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <Scrollview id="Scrollview_viewPage0" height="fill" vScrollEnabled="always" width="fill" hScrollEnabled="disabled">
        <div id="viewPage0">
            <navigatorbar id="navigatorbar0" title="一键下单" class="navigatorbarclass">
                <input id="imagebutton0" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" onclick="this.closeOneKeyOrder()" type="imagebutton" checked="false"/>
                <label id="label1"/>
                <input id="button0" value="下单" class="textbtnclass" type="button"/> 
            </navigatorbar>
            <label id="label0"/>
            <div id="panel0">
                <label id="label2">产品专线</label>
                <label id="label4"/>
                <div id="panel1">
                    <label id="label13">产品名称</label>
                    <label id="label14">北京及周边---上海及周边BS01</label> 
                </div>
                <div id="panel2">
                    <label id="label16">产品金额</label>
                    <label id="label15">￥7200</label> 
                </div>
                <div id="panel3">
                    <label id="label18">到场时间</label>
                    <label id="label17">2015-07-31 08:00-18:00</label> 
                </div>
                <div id="panel4">
                    <label id="label20">预计发运时间</label>
                    <label id="label19">您可以选择发运时间</label> 
                </div>
                <div id="panel5">
                    <label id="label22">订厢数量</label>
                    <input id="button2" value="-" class="textbtnclass" type="button"/>
                    <input id="button3" value="01" class="textbtnclass" type="button"/>
                    <input id="button1" value="+" class="textbtnclass" type="button"/> 
                </div>
                <div id="panel6">
                    <label id="label24">货值</label>
                    <input id="textbox0" maxlength="256" placeholder="请输入货值" type="text"/>
                    <label id="label23">万（必填）</label> 
                </div> 
            </div>
            <div id="panel8">
                <label id="label3">发货方</label>
                <label id="label5"/>
                <input id="button4" value="添加地址" class="textbtnclass" type="button"/> 
            </div>
            <div id="panel9">
                <label id="label6">收货方</label>
                <label id="label7"/>
                <input id="button5" value="添加地址" class="textbtnclass" type="button"/> 
            </div>
            <div id="panel10">
                <label id="label8">支付方式</label>
                <label id="label9"/>
                <div id="panel11">
                    <input id="button6" value="POS刷卡" class="textbtnclass" type="button"/>
                    <input id="button7" value="公司转账" class="textbtnclass" type="button"/> 
                </div>
                <div id="panel12">
                    <input id="button8" value="现金支付" class="textbtnclass" type="button"/>
                    <label id="label21"/> 
                </div>
                <div id="panel13">
                    <label id="label25">线路总金额</label>
                    <label id="label26">￥7200</label> 
                </div>
                <div id="panel14">
                    <label id="label27">两提金额</label>
                    <label id="label28">￥0</label> 
                </div>
                <div id="panel15">
                    <label id="label29">两送金额</label>
                    <label id="label30">￥0</label> 
                </div>
                <div id="panel16">
                    <label id="label31">代金劵</label>
                    <label id="label32">点击选择代金劵</label> 
                </div>
                <div id="panel17">
                    <label id="label33">优惠金额</label>
                    <label id="label34">-￥0</label> 
                </div>
                <div id="panel18">
                    <label id="label35">总金额</label>
                    <label id="label36">￥7200</label> 
                </div> 
            </div>
            <div id="panel20">
                <input id="checkbox0" type="checkbox" checked="checked"/>
                <label id="label10">同意《</label>
                <label id="label11">收费规则和禁运品声明</label>
                <label id="label12">》</label> 
            </div> 
        </div>
    </Scrollview> 
</window>

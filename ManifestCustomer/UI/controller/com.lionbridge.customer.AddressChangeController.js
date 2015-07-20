//JavaScript Framework 2.0 Code
try{
Type.registerNamespace('com.lionbridge.customer.AddressChangeController');
com.lionbridge.customer.AddressChangeController = function() {
    com.lionbridge.customer.AddressChangeController.initializeBase(this);
    this.initialize();
}
function com$lionbridge$customer$AddressChangeController$initialize(){
    //you can programing by $ctx API
    //get the context data through $ctx.get()
    //set the context data through $ctx.push(json)
    //set the field of the context through $ctx.put(fieldName, fieldValue)
    //get the parameter of the context through $ctx.param(parameterName)
    //Demo Code:
    //    var str = $ctx.getString();      //获取当前Context对应的字符串
    //    alert($ctx.getString())          //alert当前Context对应的字符串
    //    var json = $ctx.getJSONObject(); //获取当前Context，返回值为json
    //    json["x"] = "a";        //为当前json增加字段
    //    json["y"] = [];           //为当前json增加数组
    //    $ctx.push(json);            //设置context，并自动调用数据绑定
    //    
    //    put方法需手动调用databind()
    //    var x = $ctx.get("x");    //获取x字段值
    //    $ctx.put("x", "b");     //设置x字段值
    //    $ctx.put("x", "b");     //设置x字段值
    //    $ctx.databind();            //调用数据绑定才能将修改的字段绑定到控件上
    //    var p1 = $param.getString("p1");   //获取参数p2的值，返回一个字符串
    //    var p2 = $param.getJSONObject("p2");   //获取参数p3的值，返回一个JSON对象
    //    var p3 = $param.getJSONArray("p3");   //获取参数p1的值，返回一个数组
    
    //your initialize code below...
    
}
    
function com$lionbridge$customer$AddressChangeController$evaljs(js){
    eval(js)
}
function com$lionbridge$customer$AddressChangeController$closeAddressChange(sender, args){
	$view.closeWithCallBack({
		"result" : "{address : '北京市昌平区回龙观'}"
	});
}
function com$lionbridge$customer$AddressChangeController$loadAddressList(sender, args){
	var json = {
		list : [{
			address : "北京市昌平区回龙观",
			detail : "和谐家园二区12号楼6单元"
		}, {
			address : "北京市昌平区回龙观",
			detail : "和谐家园二区12号楼6单元"
		}, {
			address : "北京市昌平区回龙观",
			detail : "和谐家园二区12号楼6单元"
		}, {
			address : "北京市昌平区回龙观",
			detail : "和谐家园二区12号楼6单元"
		}, {
			address : "北京市昌平区回龙观",
			detail : "和谐家园二区12号楼6单元"
		}]
	}
	$ctx.push(json);
}
function com$lionbridge$customer$AddressChangeController$openAddressSelect(sender, args){
	com.lionbridge.customer.GlobalFunction.openAddressPicker();
}
function pickerOk(){
	var data = $ctx.getString("city");
    data = $stringToJSON(data);
    var result = data.content;
	$id("button1").set("value", result);
}
com.lionbridge.customer.AddressChangeController.prototype = {
    openAddressSelect : com$lionbridge$customer$AddressChangeController$openAddressSelect,
    loadAddressList : com$lionbridge$customer$AddressChangeController$loadAddressList,
    closeAddressChange : com$lionbridge$customer$AddressChangeController$closeAddressChange,
    initialize : com$lionbridge$customer$AddressChangeController$initialize,
    evaljs : com$lionbridge$customer$AddressChangeController$evaljs
};
com.lionbridge.customer.AddressChangeController.registerClass('com.lionbridge.customer.AddressChangeController',UMP.UI.Mvc.Controller);
}catch(e){$e(e);}

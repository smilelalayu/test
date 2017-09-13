/*******************公共函数*******************/
function toDate(val){
		var date;
			try{
				date = eval('new Date(' + val.replace(/\d+(?=-[^-]+$)/,function (a) { return parseInt(a, 10) - 1; }).match(/\d+/g) + ')');
				date.addMonths(-1);
			}catch(e){
				console.log(e);
				return false;
			}
      return date;
};
function dateDiff(date1,date2){
    var day = 24 * 60 * 60 *1000;
		try{ 
			var checkTime1;
			if(date1 instanceof String){
				checkTime1= toDate(date1).getTime();
			}else if(date1 instanceof Date){
				checkTime1=date1.getTime();
			}
			
			var checkTime2;
			if(date2 instanceof String){
				checkTime2= toDate(date2).getTime();
			}else if(date2 instanceof Date){
				checkTime2=date2.getTime();
			}

   			var cha = (checkTime - checkTime2)/day;  
        return cha;
    }catch(e){}
   return false;
};
/*******************公共函数*******************/

/*********************字符对象扩展************************/
String.prototype.replaceAll = function(regx,newStr){ 
	return this.replace(new RegExp(regx,"gm"),newStr); 
}

/*********************字符对象扩展************************/

/*********************数组对象扩展************************/
Array.prototype.indexOf=function(value){
	for(var i=0,l=this.length;i<l;i++){
		if(this[i]==value){
			return i;
		}
	}
	return -1;
};
Array.prototype.remove=function(value){
	var index = this.indexOf(value);
	if(index != -1){
		this.splice(index,1);
	}
};
Array.prototype.removeAll=function(array){
	if(array instanceof Array){
		for(var i = 0;i<array.length ; i++){
			this.remove(array[i]);
		}
	}
};
Array.prototype.addAll=function(array){
	if(array instanceof Array){
		for(var i = 0;i<array.length ; i++){
			this.push(array[i]);
		}
	}
};
Array.prototype.addAll=function(index,array){
	if(array instanceof Array){
		for(var i = 0;i<array.length ; i++){
			this.splice(index+i,0,array[i]);
		}
	}
};

Array.prototype.insertAt=function(index,value){
	this.splice(index,0,value);    
};

/*********************数组对象扩展************************/

/*********************日期对象扩展************************/

Date.prototype.format=function(fmt) {        
    var o = {        
    "M+" : this.getMonth()+1, //月份        
    "d+" : this.getDate(), //日        
    "h+" : this.getHours()%12 == 0 ? 12 : this.getHours()%12, //小时        
    "H+" : this.getHours(), //小时        
    "m+" : this.getMinutes(), //分        
    "s+" : this.getSeconds(), //秒        
    "q+" : Math.floor((this.getMonth()+3)/3), //季度        
    "S" : this.getMilliseconds() //毫秒        
    };        
    var week = {        
    "0" : "\u65e5",        
    "1" : "\u4e00",        
    "2" : "\u4e8c",        
    "3" : "\u4e09",        
    "4" : "\u56db",        
    "5" : "\u4e94",        
    "6" : "\u516d"       
    };        
    if(/(y+)/.test(fmt)){        
        fmt=fmt.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length));        
    }        
    if(/(E+)/.test(fmt)){        
        fmt=fmt.replace(RegExp.$1, ((RegExp.$1.length>1) ? (RegExp.$1.length>2 ? "\u661f\u671f" : "\u5468") : "")+week[this.getDay()+""]);        
    }        
    for(var k in o){        
        if(new RegExp("("+ k +")").test(fmt)){        
            fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));        
        }        
    }        
    return fmt;        
};

Date.prototype.addDays = function(d)
{
    this.setDate(this.getDate() + d);
};

Date.prototype.addWeeks = function(w)
{
    this.addDays(w * 7);
};

Date.prototype.addMonths= function(m)
{
    var d = this.getDate();
    this.setMonth(this.getMonth() + m);
    if (this.getDate() < d)
        this.setDate(0);
};

Date.prototype.addYears = function(y)
{
    var m = this.getMonth();
    this.setFullYear(this.getFullYear() + y);
    if (m < this.getMonth())
     {
        this.setDate(0);
     }
};

Date.prototype.dateDiff =function(date){
    var day = 24 * 60 * 60 *1000;
	try{ 
		var checkTime = this.getTime();

		var checkTime2;
		if(date instanceof String){
			checkTime2= toDate(date).getTime();
		}else if(date instanceof Date){
			checkTime2=date;
		}
		var cha = (checkTime - checkTime2)/day;  
		return cha;
    }catch(e){}
   return false;
};

/*********************日期对象扩展************************/
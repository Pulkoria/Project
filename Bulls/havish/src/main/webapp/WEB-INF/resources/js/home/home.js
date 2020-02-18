
$(document).ready(function(e) {
//	alert("bj");
	 $('a[href="#sign_up"]').click(function(){
	      alert('Sign new href executed. here'); 
	      
	      var subCatgry = $('#catgryId').val();
	        $("#subCatId").empty();
	        var href = "productsList.htm";
	        $.ajax({
	            url : 'subCatgryList',
	            data :  { subCatgry: subCatgry},
	            method : "GET",
	            dataType:'json',
	            success : function(dat) {
	                for(var i=0;i<dat.length;i++){
	                	
	                	var prodCatg = dat[i].prodSubCatgryId;
	                	$("#subCatId").append('<li class="sub-menu"><span><a href="productsList.htm?GET' +'&prodCatg=' + prodCatg +'" id="prodCatId"">'+dat[i].prodSubCatName+'<i class="fa fa-angle-right"></i></a></span></li>');
	                	
	                	console.log("moni");
	                }
	            },
	            error : function(xhr, status, error) {
	            	console.log("error");
	                alert("error mesages");
	            }
	        });
	   }); 
	 
	 $('a[href="#sign_up2"]').click(function(){
	      alert('Sign new href executed. here'); 
	      
	      var subCatgry = $('#catgryId2').val();
	      
	        $("#subCatId2").empty();
	        var href = "productsList.htm";
	        $.ajax({
	            url : 'subCatgryList',
	            data :  { subCatgry: subCatgry},
	            method : "GET",
	            dataType:'json',
	            success : function(dat) {
	                for(var i=0;i<dat.length;i++){
	                	
	                	var prodCatg = dat[i].prodSubCatgryId;
	                	$("#subCatId2").append('<li class="sub-menu"><span><a href="productsList.htm?GET' +'&prodCatg=' + prodCatg +'" id="prodCatId"">'+dat[i].prodSubCatName+'<i class="fa fa-angle-right"></i></a></span></li>');
	                	
	                	console.log("moni");
	                }
	            },
	            error : function(xhr, status, error) {
	            	console.log("error");
	                alert("error mesages");
	            }
	        });
	   }); 
	 
	 $('a[href="#sign_up3"]').click(function(){
	      alert('Sign new href executed. here'); 
	      
	      var subCatgry = $('#catgryId3').val();
	        $("#subCatId3").empty();
	        var href = "productsList.htm";
	        $.ajax({
	            url : 'subCatgryList',
	            data :  { subCatgry: subCatgry},
	            method : "GET",
	            dataType:'json',
	            success : function(dat) {
	                for(var i=0;i<dat.length;i++){
	                	
	                	var prodCatg = dat[i].prodSubCatgryId;
	                	$("#subCatId3").append('<li class="sub-menu"><span><a href="productsList.htm?GET' +'&prodCatg=' + prodCatg +'" id="prodCatId"">'+dat[i].prodSubCatName+'<i class="fa fa-angle-right"></i></a></span></li>');
	                	
	                	console.log("moni");
	                }
	            },
	            error : function(xhr, status, error) {
	            	console.log("error");
	                alert("error mesages");
	            }
	        });
	   }); 
	 
	 $('a[href="#sign_up4"]').click(function(){
	      alert('Sign new href executed. here'); 
	      
	      var subCatgry = $('#catgryId4').val();
	        $("#subCatId4").empty();
	        var href = "productsList.htm";
	        $.ajax({
	            url : 'subCatgryList',
	            data :  { subCatgry: subCatgry},
	            method : "GET",
	            dataType:'json',
	            success : function(dat) {
	                for(var i=0;i<dat.length;i++){
	                	
	                	var prodCatg = dat[i].prodSubCatgryId;
	                	$("#subCatId4").append('<li class="sub-menu"><span><a href="productsList.htm?GET' +'&prodCatg=' + prodCatg +'" id="prodCatId"">'+dat[i].prodSubCatName+'<i class="fa fa-angle-right"></i></a></span></li>');
	                	
	                	console.log("moni");
	                }
	            },
	            error : function(xhr, status, error) {
	            	console.log("error");
	                alert("error mesages");
	            }
	        });
	   }); 
	 
	 $('a[href="#sign_up5"]').click(function(){
	      alert('Sign new href executed. here'); 
	      
	      var subCatgry = $('#catgryId5').val();
	        $("#subCatId5").empty();
	        var href = "productsList.htm";
	        $.ajax({
	            url : 'subCatgryList',
	            data :  { subCatgry: subCatgry},
	            method : "GET",
	            dataType:'json',
	            success : function(dat) {
	                for(var i=0;i<dat.length;i++){
	                	
	                	var prodCatg = dat[i].prodSubCatgryId;
	                	$("#subCatId5").append('<li class="sub-menu"><span><a href="productsList.htm?GET' +'&prodCatg=' + prodCatg +'" id="prodCatId"">'+dat[i].prodSubCatName+'<i class="fa fa-angle-right"></i></a></span></li>');
	                	
	                	console.log("moni");
	                }
	            },
	            error : function(xhr, status, error) {
	            	console.log("error");
	                alert("error mesages");
	            }
	        });
	   }); 
	 
	 
	$('#sign_up').click(function(event){
        alert('Sign new href executed.');
        event.stopPropagation();
    });
	$("#cartId").click(function(e){
		alert("cart clicked fun");
		var userId = "7349087660";
		window.location.href= 'userCart.htm?GET' +'&userId=' + userId ;
		
	});
	
	$("#login").modal("hide");
	$("#otpVeri").modal("hide");
	$("#loginId").click(function(e){

	var phoneNo = $("#phoneNo").val();
	var password = $("#password").val();
	
		$.ajax({
		
		url: 'newlogin',
		data : {
			"phoneNo" : phoneNo,
			"password" : password
		},
		method:"GET",
		dataType : 'json',
		success : function(dat){
			//append to new popup
			
			alert(dat.otp);
			if(dat.status == "ERINU"){
				$("#errorMsg").append("Invalid User.Create an account to proceed");
				$("#loginotpVeri").modal("hide");
				return false
			}else if(dat.status == "ERINVP"){
				$("#errorMsg").append("Invalid Password.Reset passsword to proceed");
				$("#loginotpVeri").modal("hide");
				return false
			}else if(dat.status == "SUCCESS"){
				$('input[id=lgeneratedOTP]').val(dat.otp);
				
				$("#loginotpVeri").modal("show");
				$("#otpVeri").modal("hide");
				return true
			}
		},
		error :function (xhr, status, error) {
        	console.log("error");
        },
    });
	
	
	});
	
	$("#logverifOTP").click(function(e){
		var oldOTP = $("#lgeneratedOTP").val();
		var newOTP = $("#lsuserotp").val();
		if(oldOTP == newOTP){
			window.location.href= 'loginOTPVerify.htm?GET' +'&newOTP=' + newOTP  
		}else{
			alert("enter the correct OTP");
		}
		//alert("emailId otp"+emailId);
	});
	
	//on click of submit
	$("#signUpSub").click(function(e){
		$("#otpVeri").modal("show");
	var phoneNo = $("#mobileNo").val();
	var userName = $("#userName").val();
	var emailId = $("#emailId").val();
	var password = $("#password").val();
	$.ajax({
		
		url: 'userReg',
		data : {
			"phoneNo" : phoneNo,
			"userName" : userName,
			"email" : emailId,
			"password" : password
		},
		method:"GET",
		dataType : 'json',
		success : function(dat){
			alert("generate OTP"+dat.otp);
			//append to new popup
			$("#otpVeri").modal("show");
			$('input[id=phonenoHidId]').val(dat.phoneNo);
			$('input[id=userNameHidId]').val(dat.userName);
			$('input[id=emailHid]').val(dat.emailId);
			$('input[id=generatedOTP]').val(dat.otp);
			$('input[id=passwordHidId]').val(dat.otp);
		},
		error :function (xhr, status, error) {
        	console.log("error");
            alert("error mesages");
        },
    });
	});
	
	//on click of new popup submit compare old one and  new one then insert
	
	$("#verifOTP").click(function(e){
	
		var oldOTP = $("#generatedOTP").val();
		var newOTP = $("#userotp").val();
		var userName = $("#userNameHidId").val();
		var phoneNo = $("#phonenoHidId").val();
		var emailId = $("#emailHid").val();
		var password = $("#passwordHidId").val();
		if(oldOTP == newOTP){
			$.ajax({
				
				url: 'signUpinsert',
				data : {
					"phoneNo" : phoneNo,
					"userName" : userName,
					"emailId" : emailId,
					"password" : password
				},
				method:"GET",
				dataType : 'json',
				success : function(dat){
					$("#otpVeri").modal("hide");
					//check status and show message.
				},
				error :function (xhr, status, error) {
		        	console.log("error");
		            alert("error mesages");
		        },
		    });
		}
	});

	$("#searchKeyId").click(function(e){
		alert("clicked");
		var searchKey=$("#searchKey").val();
		window.location.href= 'prodBySearchKey.htm?GET' +'&searchKey=' + searchKey;
		$("#hidSearchId").append(searchKey);
	});
	
	 $(".sub-menu li").click(function() {
		 // this variable name should be categoryId
		 var subCatgry = $(this).attr('value');
		 var subCategoryIdToAppendData = 'subCatListId'+subCatgry;
	       
	   $(`#${subCategoryIdToAppendData}`).empty();
	   var href = "productsList.htm";
	   $.ajax({
	       url : 'subCatgryList',
	       data :  { subCatgry: subCatgry},
	       method : "GET",
	       dataType:'json',
	       success : function(dat) {
	           for(var i=0;i<dat.length;i++){
	           	var prodCatg = dat[i].prodSubCatgryId;
	           	
	           	console.log(subCatId,"subCatId");
	           	$(`#${subCategoryIdToAppendData}`).append('<li class="sub-menu"><span><a href="productsList.htm?GET' +'&prodCatg=' + prodCatg +'" id="prodCatId"">'+dat[i].prodSubCatName+'<i class="fa fa-angle-right"></i></a></span></li>');
	           	}
	       },
	       error : function(xhr, status, error) {
	       	console.log("error");
	       	$(`#${subCategoryIdToAppendData}`).append('<li class="sub-menu"><span>No data avaiable</span></li>');
//	           alert("error mesages");
	       }
	   });
	 });
	 
	 //commented this method and wrote a new method (above method)
	 
//	$('a[href="#catbutId"]').off('click').on("click",function() {
//	/*$("#ahref").click(function(e){*/
//        var subCatgry = $('#catgry').val();
//       
////        alert("catg 2" +subCatgry);
//        $("#subCatListId").empty();
//        var href = "productsList.htm";
//        $.ajax({
//            url : 'subCatgryList',
//            data :  { subCatgry: subCatgry},
//            method : "GET",
//            dataType:'json',
//            success : function(dat) {
//                for(var i=0;i<dat.length;i++){
//                	/*$('#subCatListId').append('<li role="menu" class="sub-menu"><li> '+dat[i].prodSubCatName+'<li></ul>');
//                	
//                	$("ul").append("<li>Appended item</li>");
//                	alert( "sucess name of sub catgry "+dat[i].prodSubCatName);
//                	
//                	prodSubCatName += '<li>'+dat[i].prodSubCatName+'</li>';
//                	
//					
//                	$('#subCatListId').append('<li  class="dropdown"><li role="menu" class="sub-menu">'+dat[i].prodSubCatName+' <li> </li>');
//                	
//                	$('#listIdSubCat').append('<li role="menu" class="sub-menu">'+dat[i].prodSubCatName+' </li>');
//                	$("#subCatListId").append('<li class="sub-menu"><span><a href="'+ dat[i].prodSubCatgryId +'" onclick="function()">'+dat[i].prodSubCatName+'</a></span></li>');*/
//                	var prodCatg = dat[i].prodSubCatgryId;
//                	$("#subCatListId").append('<li class="sub-menu"><span><a href="productsList.htm?GET' +'&prodCatg=' + prodCatg +'" id="prodCatId"">'+dat[i].prodSubCatName+'<i class="fa fa-angle-right"></i></a></span></li>');
//                	/*$("#subCatListId").append('<li class="sub-menu"><span><a href="productsList.htm?GET' +'&prodCatg=' + prodCatg +'" id="prodCatId"">'+dat[i].prodSubCatName+'<i class="fa fa-angle-right"></i></a></span></li>');*/
//                	
////                	$('#listIdSubCat').append('<li  class="dropdown"> <ul role="menu" class="sub-menu"><li>'+dat[i].prodSubCatName+' </li></ul></li>');
//
//                	console.log("moni");
//                }
//            },
//            error : function(xhr, status, error) {
//            	console.log("error");
//                alert("error mesages");
//            }
//        });
//    });
});
$(document).ready(function() {
    fbox();
});

function changeImage(el) {
	if(el == 'black') {
		 $("#changeble_image_one_s").attr("src","../images/chairspage/black_one.png");
	     $("#changeble_image_two_s").attr("src","../images/chairspage/black_two.png");
	        
	     $("#changeble_image_one_b").attr("href","../images/chairspage/black_one_b.png");
	     $("#changeble_image_two_b").attr("href","../images/chairspage/black_two_b.png");
	} else if(el == 'red') {
		 $("#changeble_image_one_s").attr("src","../images/chairspage/red_one.png");
	     $("#changeble_image_two_s").attr("src","../images/chairspage/red_two.png");
	        
	     $("#changeble_image_one_b").attr("href","../images/chairspage/red_one_b.png");
	     $("#changeble_image_two_b").attr("href","../images/chairspage/red_two_b.png");
	} else if (el == 'blue') {
		 $("#changeble_image_one_s").attr("src","../images/chairspage/blue_one.png");
	     $("#changeble_image_two_s").attr("src","../images/chairspage/blue_two.png");
	        
	     $("#changeble_image_one_b").attr("href","../images/chairspage/blue_one_b.png");
	     $("#changeble_image_two_b").attr("href","../images/chairspage/blue_two_b.png");
	} else if (el == 'dark_grey') {
		 $("#changeble_image_one_s").attr("src","../images/chairspage/grey_one.png");
	     $("#changeble_image_two_s").attr("src","../images/chairspage/grey_two.png");
	        
	     $("#changeble_image_one_b").attr("href","../images/chairspage/grey_one_b.png");
	     $("#changeble_image_two_b").attr("href","../images/chairspage/grey_two_b.png");
	} 
};

function fbox() {
	$("a[rel=example_group]").fancybox({
		'transitionIn'		: 'none',
		'transitionOut'		: 'none',
		'titlePosition' 	: 'over',
		'titleFormat'		: function(title, currentArray, currentIndex, currentOpts) {
			return '<span id="fancybox-title-over">Image ' + (currentIndex + 1) + ' / ' + currentArray.length + (title.length ? ' &nbsp; ' + title : '') + '</span>';
		}
	});
};

function vibrateImage() {
	$('.vibrateImage').jrumble();
	$('.vibrateImage').hover(function(){
		$(this).trigger('startRumble');
	}, function(){
		$(this).trigger('stopRumble');
	});
};

function menu(current_page) {
        $('#sdt_menu > li').bind('mouseenter',
        	function(){
			var $elem = $(this);
			$elem.find('.sdt_link').css("color","red");
			$elem.find('img')
				 .stop(true)
				 .animate({
					'width':'35px',
					'height':'35px',
					'top':'-10px',
				 },1)
				 .andSelf()
				 .find('.sdt_wrap')
			     .stop(true)
				 .animate({'top':'35px'},500,'easeOutBack')
				 .andSelf();
		})
		.bind('mouseleave',
				function(){
				var $elem = $(this);
				if($elem.find('.sdt_link').attr("id") != current_page) {
					$elem.find('.sdt_link').css("color","black");
				}
				$elem.find('.sdt_active')
					 .stop(true)
					 .animate({'height':'0px'},300)
					 .andSelf().find('img')
					 .stop(true)
					 .animate({
						'width':'0px',
						'height':'0px',
					},1)
					 .andSelf()
					 .find('.sdt_wrap')
					 .stop(true)
					 .animate({'top':'25px'},500);
			});
};

function menu_selector(page) {
	$("#"+page).css("color","red");
};

function prepareTextArea() {
	$('textarea.autosizejs').remove();
	$('textarea.inputFieldComment').autosize();
};

function table() {
	var table = $('table');
	table.animate({borderColor: "#3737A2"}, 250)
    .animate({borderColor: "#FFFFFF"}, 250)
    .animate({borderColor: "#3737A2"}, 250)
    .animate({borderColor: "#FFFFFF"}, 250);
};


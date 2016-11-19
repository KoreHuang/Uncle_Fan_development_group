////导航部分/////////////////////////////////
$(function() {
		/*头部导航菜单begin*/
		$('.navBar').toggle(
				function() {
					$('.nav').addClass('on');
					$('section').css('margin-top', '85px');
					if ($('#filter_search') != null
							&& $('#filter_search') != 'undefined') {
						$('#filter_search .filterMask').css('top', '135px');
						$('#filter_search .filterFrame').css('top', '135px');
					}
				},
				function() {
					$('.nav').removeClass('on');
					$('section').css('margin-top', '40px');
					if ($('#filter_search') != null
							&& $('#filter_search') != 'undefined') {
						$('#filter_search .filterMask').css('top', '90px');
						$('#filter_search .filterFrame').css('top', '90px');
					}
				});
		/*头部导航菜单end*/
	});

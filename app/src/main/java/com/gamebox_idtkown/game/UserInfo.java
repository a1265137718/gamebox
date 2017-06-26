package com.gamebox_idtkown.game;

import com.alibaba.fastjson.annotation.JSONField;

public class UserInfo {

	@JSONField(name = "user_id")
	public String userId;

	@JSONField(name = "name")
	public String username;

	public String mobile;

	@JSONField(name = "nick_name")
	public String nickName;

	public String face;

	public int sex;

	public String birth;

	@JSONField(name = "area_id")
	public String areaId;

	public String email;

	public String qq;

	public String password;

	public String newpassword;

	public int isrpwd = 0;// 0已经修改过密码，1表示没有修改过密码

	public int device = 2;// 1为pc端，2为Android端 3为ios

	public String imeil;//

	public String deviceinfo;//

	public String agent;//

	@JSONField(name = "money")
	public String ttb; // 平台币

	@JSONField(name = "game_money")
	public String gttb; // 游戏币总数量

	@JSONField(name = "is_vali_mobile")
	public int validateMobile;// 是否绑定手机（1：是，0：否）

	public String sign;//

	public long logintime;// 时间戳

	public int accountType = 0; // 0.手机注册账户,1.账号密码注册账户

	public String agentId;
	
	@JSONField(name = "kefu_qq")
	public String kefuQQ;
	
	@JSONField(name = "vip_level")
	public int vipLevel;//VIP等级
	
	@JSONField(name = "share_content")
	public String shareContent;
	
	//是否开启游戏返利(true：是,false：否)
	@JSONField(name = "game_return")
	public boolean isGameReturn;
}

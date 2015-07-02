package com.world.wen.vo.response;

import java.util.ArrayList;
import java.util.List;

import com.world.wen.vo.ResponseBody;

/**
 * 
 * @author jswu
 *
 */
public class GetAllTopicResp extends ResponseBody {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6811891513108578334L;

	List<GetTopicResp> getTopicResps = new ArrayList<GetTopicResp>();

	public List<GetTopicResp> getGetTopicResps() {
		return getTopicResps;
	}

	public void setGetTopicResps(List<GetTopicResp> getTopicResps) {
		this.getTopicResps = getTopicResps;
	}
}

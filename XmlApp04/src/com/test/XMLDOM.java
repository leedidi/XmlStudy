package com.test;

import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class XMLDOM
{
	public static String getText(Element parent, String tagName)
	{
		// 반환할 결과값
		String result = "";
		
		// 특정 태그 이름을 가진 객체의 첫 번째 자식 노드를 얻어온 다음
		Node node = parent.getElementsByTagName(tagName).item(0);
		Element element = (Element)node;
		
		// 특정 엘리먼트의 자식 노드(Text Node)의 값(nodeValue)을 얻어올 수 있도록 처리
		result = element.getChildNodes().item(0).getNodeValue();
		
		// 결과값 반환
		return result;
	}
}
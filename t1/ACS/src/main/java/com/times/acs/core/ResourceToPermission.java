/*
 * �������� 2006-6-14
 *
 * TODO Ҫ��Ĵ���ɵ��ļ���ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
package com.times.acs.core;

import java.io.Serializable;
import java.util.List;

import com.times.acs.pojo.admin.PermissionsPOJO;

public interface ResourceToPermission extends Serializable {

	String getPermission(String resource);

	List<PermissionsPOJO> getPermisssions(List<String> resource);

}

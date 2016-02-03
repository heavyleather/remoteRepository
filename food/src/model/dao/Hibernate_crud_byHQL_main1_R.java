package model.dao;


import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernateUtil.HibernateUtil;
import model.memberVO;

import java.util.*;
import java.util.*;


public class Hibernate_crud_byHQL_main1_R  {
	
	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			
//�iA.���򪫥����d��************************************************************************************************************************�j
//        �iHQL�l�y�����j�p�g�L���A���O�䤤�X�{�����O�W�٩M�ݩʦW�٥����`�N�j�p�g�Ϥ��j
//			Query query = session.createQuery("from com.emp.model.EmpVO");
			Query query = session.createQuery("from memberVO");
//			Query query = session.createQuery("from EmpVO order by empno");
//			Query query = session.createQuery("from EmpVO order by empno desc");
//			Query query = session.createQuery("from EmpVO as empvo order by empvo.empno");

//        �i�ʸˬd�߱���j
//			Query query = session.createQuery("from EmpVO where ename like '%K%'");
//			Query query = session.createQuery("from EmpVO where empno=7001 and ename='KING' and hiredate='1981-11-17'  order by empno");

//        �i�ѼƸj�w-�ϥ�?�j
//			Query query = session.createQuery("from EmpVO where empno=? and ename=? and hiredate=? order by empno");
//			query.setParameter(0, 7001);
//			query.setParameter(1, "KING");
//			query.setParameter(2, java.sql.Date.valueOf("1981-11-17"));

//        �i�ѼƸj�w-�ϥΨ�W�Ѽơ]Named Parameter�^�j
//			Query query = session.createQuery("from EmpVO where empno=:empno and ename=:ename and hiredate=:hiredate order by empno");
//			query.setParameter("empno", 7001);
//			query.setParameter("ename", "KING");
//			query.setParameter("hiredate", java.sql.Date.valueOf("1981-11-17"));

//        �i�ѼƸj�w-�ϥΨ�W�Ѽơ]Named Parameter�^�� �ʸˬd�߰Ѽƪ�JavaBean�j
//			Query query = session.createQuery("from EmpVO where empno=:empno and ename=:ename and hiredate=:hiredate order by empno");
//			  EmpVO empVO = new EmpVO();
//			  empVO.setEmpno(7001);
//			  empVO.setEname("KING");
//			  empVO.setHiredate(java.sql.Date.valueOf("1981-11-17"));
//			query.setProperties(empVO);

//        �i�i�����j
//			Query query = session.createQuery("from EmpVO");
//			query.setFirstResult(0); //0,3,6,9,12...
//			query.setMaxResults(3);  //���]�C����3��

//		     �i���լd�ߵ��G�j
//        �iquery.list();�����^��List�j
			List<memberVO> list = query.list();
			for (memberVO aEmp : list) {
				System.out.print(aEmp.getMember_ID() + ",");
				System.out.print(aEmp.getName() + ",");
				System.out.print(aEmp.getAcc_email() + ",");
				System.out.print(aEmp.getPwd() + ",");
				System.out.print(aEmp.getMember_photo() + ",");
				System.out.print(aEmp.getGender() + ",");
				System.out.print(aEmp.getTel() + ",");
				System.out.print(aEmp.getGUAR_CT() + ",");
				System.out.print(aEmp.getGUAR_AR() + ",");
				System.out.print(aEmp.getNB_CODE() + ",");
				System.out.print(aEmp.getGUAR_NO() + ",");
				System.out.print(aEmp.getEmail2() + ",");
				System.out.print(aEmp.getCel() + ",");
				System.out.print(aEmp.getInsdate() + ",");
				System.out.println();
			}


//�iB.�ݩʬd��*******************************************************************************************************************************�j
//        �i�u�d�߬Y��@���ݩʡA�d�ߵ��G�HObject�h���Ǧ^�A���h�����ݩʪ���l���A�j
//			Query query = session.createQuery("select empno from EmpVO");
//			List<Object> list = query.list();
//			for (Object empno : list) {
//				System.out.println(empno);
//			}
			
//        �i�d�ߨ�ӥH�W���ݩʡA�d�ߵ��G�H�}�C�Ǧ^�j
//			Query query = session.createQuery("select empno , ename, hiredate from EmpVO");
//			List<Object[]> list = query.list();
// 			for (Object[] aArray : list) {
// 				for (Object aColumn : aArray) {
// 					System.out.print(aColumn + " ");
// 				}
// 				System.out.println();
// 			}
			
			
// �iC.�έp**********************************************************************************************************************************�j
//        �i�έp-�d�߸�ƪ����ơA�d�ߵ��G�HObject�h���Ǧ^�A�������A�h��Long�j
// 			Query query = session.createQuery("select count(*) as count from EmpVO");
// 			long count = (Long)query.list().get(0);
// 			System.out.println("��������Ʀ@"+count+"��");

//        �i�έp-�d�߸�ƪ������ȡA�d�ߵ��G�HObject�h���Ǧ^�A�������A�h��Double�j
// 			Query query = session.createQuery("select avg(sal) from EmpVO");
// 			Double count = (Double)(query.list().get(0));
// 			System.out.println("�������~����"+count+"��");

//        �i�έp-�ϥ�distinct�h����ƭ��ƪ��O���j
//			Query query = session.createQuery("select distinct deptno from EmpVO order by deptno");
//			List<Object> list = query.list();
//			for (Object deptno : list) {
//				System.out.println("�i�����s��:"+deptno+"�j" );
//			}
			
//        �i�έp-group by�j
//			Query query = session.createQuery("select deptno, count(*) from EmpVO group by deptno order by deptno");
//			List<Object[]> list = query.list();
// 			for (Object[] aArray : list) {
// 				System.out.print("�i�����s��:"+aArray[0]+"�j" );
// 				System.out.print("�i���u�H��:"+aArray[1]+"�j");
// 				System.out.println();
// 			}
 			
//        �i�έp-group by�j
//			Query query = session.createQuery("select deptvo.deptno ,deptvo.dname, count(*) as count from EmpVO empvo, DeptVO deptvo where empvo.deptno=deptvo.deptno group by deptvo.deptno,deptvo.dname order by deptvo.deptno");
//			List<Object[]> list = query.list();
// 			for (Object[] aArray : list) {
// 				System.out.print("�i�����s��:"+aArray[0]+"�j" );
// 				System.out.print("�i�����W��:"+aArray[1]+"�j" );
// 				System.out.print("�i���u�H��:"+aArray[2]+"�j");
// 				System.out.println();
// 			}
			
			tx.commit();
		} catch (RuntimeException ex) {
			if (tx != null)
				tx.rollback();
			throw ex; //System.out.println(ex.getMessage());
		} finally {
			session.close();
			HibernateUtil.getSessionFactory().close();
		}
	}
}

package com.stocks.dao.impl;
import java.util.List;
import javax.transaction.Transaction;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.stocks.dao.StockExchangeDao;
import com.stocks.dao.UserDao;
import com.stocks.datamodel.StockExchange;
import com.stocks.datamodel.User;


@Transactional
@Repository(value = "stockExchangeDao")
public class StockExchangeDaoImpl implements StockExchangeDao{

		@Autowired
		SessionFactory sessionFactory;

		@Override
		public boolean saveOrUpdateStockExchange(StockExchange stockexchange) {
			try {
				sessionFactory.getCurrentSession().save(stockexchange);
				return true;
			} catch (HibernateException e) {
				e.printStackTrace();
				return false;
			}
		}

//		@Override
//		public boolean updateStockExchange(StockExchange stockexchange) {
//			try {
//				sessionFactory.getCurrentSession().update(stockexchange);
//				return true;
//			} catch (HibernateException e) {
//				e.printStackTrace();
//				return false;
//			}
//		}

		@Override
		public boolean deleteStockExchange(StockExchange stockexchange) {
			try {
				sessionFactory.getCurrentSession().delete(stockexchange);
				return true;
			} catch (HibernateException e) {
				e.printStackTrace();
				return false;
			}
		}

		@Override
		public StockExchange getStockExchangeById(int id) {
			try {
				return sessionFactory.getCurrentSession().get(StockExchange.class,id);
			} catch (HibernateException e) {
				e.printStackTrace();
				return null;
			}
		}

		@Override
		public List<StockExchange> getAllStockExchange() {
			try {
				List<StockExchange> stocks = sessionFactory.getCurrentSession().createQuery("from StockExchange").list();
				return stocks;
			} catch (HibernateException e) {
				e.printStackTrace();
				return null;
			}
		}

		@Override
		public boolean isValidStockExchange(String name, String address) {
			try {
				Query query = sessionFactory.getCurrentSession().createQuery("from StockExchange where name=:name and address=:address"); 
				query.setString("name",name);
				query.setString("address",address);
				
				List<StockExchange> list= query.list();
				if(list.size()>0) {
					return true;
				}
				else {
					return false;
				}
				
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
				
			}
		}


	}


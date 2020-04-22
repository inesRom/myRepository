package com.ems.main.utill.el;


import javax.el.ELContext;
import javax.faces.context.FacesContext;
import javax.faces.el.EvaluationException;
import javax.faces.el.PropertyNotFoundException;
import javax.faces.el.PropertyResolver;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeanUtils;

@SuppressWarnings("deprecation")
public final class PropertyResolverImpl extends PropertyResolver {

	/** Logger available to subclasses */
	protected final Log logger = LogFactory.getLog(getClass());

	@Override
	public Object getValue(final Object base, final Object property) throws EvaluationException, PropertyNotFoundException {
		if (base == null) {
			return null;
		}
		if (property == null) {
			return null;
		}

		Object res = null;
		try {
			Class<?> classType = PropertyUtils.getPropertyType(base, property.toString());
			res = PropertyUtils.getProperty(base, property.toString());
			if (res == null) {
				res = BeanUtils.instantiate(classType);
				PropertyUtils.setProperty(base, property.toString(), res);

				elContext().setPropertyResolved(true);
				return res;
			}
		} catch (Exception e) {
			// do nothing
		}

		elContext().setPropertyResolved(false);
		return null;
	}

	@Override
	public boolean isReadOnly(Object base, int index) throws EvaluationException, PropertyNotFoundException {
		elContext().setPropertyResolved(false);
		return false;
	}

	@Override
	public boolean isReadOnly(Object base, Object property) throws EvaluationException, PropertyNotFoundException {
		elContext().setPropertyResolved(false);
		return false;
	}

	@Override
	public Object getValue(Object base, int index) throws EvaluationException, PropertyNotFoundException {
		elContext().setPropertyResolved(false);
		return null;
	}

	@Override
	public Class<?> getType(Object base, int index) throws EvaluationException, PropertyNotFoundException {
		elContext().setPropertyResolved(false);
		return null;
	}

	@Override
	public Class<?> getType(Object base, Object property) throws EvaluationException, PropertyNotFoundException {
		elContext().setPropertyResolved(false);
		return null;
	}

	@Override
	public void setValue(Object base, Object property, Object value) throws EvaluationException, PropertyNotFoundException {
		elContext().setPropertyResolved(false);
	}

	@Override
	public void setValue(Object base, int index, Object value) throws EvaluationException, PropertyNotFoundException {
		elContext().setPropertyResolved(false);
	}

	private ELContext elContext() {
		return FacesContext.getCurrentInstance().getELContext();
	}

}
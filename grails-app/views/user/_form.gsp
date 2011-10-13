<%@ page import="br.com.gfuture.grails.full.example.User" %>



<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'createdAt', 'error')} required">
	<label for="createdAt">
		<g:message code="user.createdAt.label" default="Created At" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="createdAt" precision="day"  value="${userInstance?.createdAt}"  />
</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="user.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${userInstance?.name}"/>
</div>


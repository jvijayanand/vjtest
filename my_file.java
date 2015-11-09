/**
 *
 */
package com.unifirst.platform.punchout.service;

import com.unifirst.platform.punchout.exception.TransformationException;
import com.unifirst.platform.punchout.message.incoming.MessageEntry;
import com.unifirst.platform.punchout.message.transformed.ocr.OrderCreateResponseMessage;
import com.unifirst.platform.punchout.message.transformed.ocr.OrderRequest;
import com.unifirst.platform.punchout.message.transformed.poom.PunchOutOrderMessage;
import com.unifirst.platform.punchout.message.transformed.posr.PunchInSetupRequestMessage;
import com.unifirst.platform.punchout.message.transformed.posr.PunchInSetupResponseMessage;


/**
 * @author vijayanand Jambulingam 123
 *
 */
public interface TransformationService
{

	PunchInSetupRequestMessage transformInboundPOSRMessage(MessageEntry entry) throws TransformationException;

	String transformOutboundPOSRResponseMessage(PunchInSetupResponseMessage responseMessage, MessageEntry entry)
			throws TransformationException;

	String transformOutboundPOOM(final PunchOutOrderMessage poom) throws TransformationException;

	OrderRequest transformInboundOCRMessage(MessageEntry entry) throws TransformationException;

	String transformOutboundOCRResponseMessage(OrderCreateResponseMessage responseMessage, MessageEntry entry)
			throws TransformationException;

}

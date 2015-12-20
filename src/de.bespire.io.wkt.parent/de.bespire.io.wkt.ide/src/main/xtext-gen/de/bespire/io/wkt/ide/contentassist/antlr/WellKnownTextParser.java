/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package de.bespire.io.wkt.ide.contentassist.antlr;

import com.google.inject.Inject;
import de.bespire.io.wkt.ide.contentassist.antlr.internal.InternalWellKnownTextParser;
import de.bespire.io.wkt.services.WellKnownTextGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class WellKnownTextParser extends AbstractContentAssistParser {

	@Inject
	private WellKnownTextGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalWellKnownTextParser createParser() {
		InternalWellKnownTextParser result = new InternalWellKnownTextParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getWKTAccess().getAlternatives(), "rule__WKT__Alternatives");
					put(grammarAccess.getUnsignedDecimalAccess().getAlternatives_0(), "rule__UnsignedDecimal__Alternatives_0");
					put(grammarAccess.getUnsignedDecimalAccess().getAlternatives_2(), "rule__UnsignedDecimal__Alternatives_2");
					put(grammarAccess.getUnsignedIntAccess().getAlternatives(), "rule__UnsignedInt__Alternatives");
					put(grammarAccess.getExtentAccess().getAlternatives(), "rule__Extent__Alternatives");
					put(grammarAccess.getIdentifierAccess().getAlternatives_4(), "rule__Identifier__Alternatives_4");
					put(grammarAccess.getIdentifierAccess().getAlternatives_5_1(), "rule__Identifier__Alternatives_5_1");
					put(grammarAccess.getCRSAccess().getAlternatives(), "rule__CRS__Alternatives");
					put(grammarAccess.getGeodeticCRSAccess().getAlternatives_0(), "rule__GeodeticCRS__Alternatives_0");
					put(grammarAccess.getVerticalCRSAccess().getAlternatives_0(), "rule__VerticalCRS__Alternatives_0");
					put(grammarAccess.getEngineeringCRSAccess().getAlternatives_0(), "rule__EngineeringCRS__Alternatives_0");
					put(grammarAccess.getProjectedCRSAccess().getAlternatives_0(), "rule__ProjectedCRS__Alternatives_0");
					put(grammarAccess.getDatumAccess().getAlternatives(), "rule__Datum__Alternatives");
					put(grammarAccess.getGeodeticDatumAccess().getAlternatives_0(), "rule__GeodeticDatum__Alternatives_0");
					put(grammarAccess.getEngineeringDatumAccess().getAlternatives_0(), "rule__EngineeringDatum__Alternatives_0");
					put(grammarAccess.getVerticalDatumAccess().getAlternatives_0(), "rule__VerticalDatum__Alternatives_0");
					put(grammarAccess.getEllipsoidAccess().getAlternatives_0(), "rule__Ellipsoid__Alternatives_0");
					put(grammarAccess.getPrimeMeridianAccess().getAlternatives_0(), "rule__PrimeMeridian__Alternatives_0");
					put(grammarAccess.getCoordinateSystemAccess().getDimensionAlternatives_4_0(), "rule__CoordinateSystem__DimensionAlternatives_4_0");
					put(grammarAccess.getAxisDirectionAccess().getAlternatives(), "rule__AxisDirection__Alternatives");
					put(grammarAccess.getOperationMethodAccess().getAlternatives_0(), "rule__OperationMethod__Alternatives_0");
					put(grammarAccess.getParameterUnitAccess().getAlternatives(), "rule__ParameterUnit__Alternatives");
					put(grammarAccess.getUnitAccess().getAlternatives(), "rule__Unit__Alternatives");
					put(grammarAccess.getCoordinateSystemTypeAccess().getAlternatives(), "rule__CoordinateSystemType__Alternatives");
					put(grammarAccess.getSignedDecimalAccess().getGroup(), "rule__SignedDecimal__Group__0");
					put(grammarAccess.getUnsignedDecimalAccess().getGroup(), "rule__UnsignedDecimal__Group__0");
					put(grammarAccess.getScopeAccess().getGroup(), "rule__Scope__Group__0");
					put(grammarAccess.getAreaDescriptionAccess().getGroup(), "rule__AreaDescription__Group__0");
					put(grammarAccess.getGeographicBoundingBoxAccess().getGroup(), "rule__GeographicBoundingBox__Group__0");
					put(grammarAccess.getVerticalExtentAccess().getGroup(), "rule__VerticalExtent__Group__0");
					put(grammarAccess.getVerticalExtentAccess().getGroup_5(), "rule__VerticalExtent__Group_5__0");
					put(grammarAccess.getIdentifierAccess().getGroup(), "rule__Identifier__Group__0");
					put(grammarAccess.getIdentifierAccess().getGroup_5(), "rule__Identifier__Group_5__0");
					put(grammarAccess.getIdentifierAccess().getGroup_6(), "rule__Identifier__Group_6__0");
					put(grammarAccess.getIdentifierAccess().getGroup_7(), "rule__Identifier__Group_7__0");
					put(grammarAccess.getCitationAccess().getGroup(), "rule__Citation__Group__0");
					put(grammarAccess.getURIAccess().getGroup(), "rule__URI__Group__0");
					put(grammarAccess.getRemarkAccess().getGroup(), "rule__Remark__Group__0");
					put(grammarAccess.getGeodeticCRSAccess().getGroup(), "rule__GeodeticCRS__Group__0");
					put(grammarAccess.getGeodeticCRSAccess().getGroup_7(), "rule__GeodeticCRS__Group_7__0");
					put(grammarAccess.getGeodeticCRSAccess().getGroup_8(), "rule__GeodeticCRS__Group_8__0");
					put(grammarAccess.getGeodeticCRSAccess().getGroup_9(), "rule__GeodeticCRS__Group_9__0");
					put(grammarAccess.getGeodeticCRSAccess().getGroup_10(), "rule__GeodeticCRS__Group_10__0");
					put(grammarAccess.getVerticalCRSAccess().getGroup(), "rule__VerticalCRS__Group__0");
					put(grammarAccess.getVerticalCRSAccess().getGroup_7(), "rule__VerticalCRS__Group_7__0");
					put(grammarAccess.getVerticalCRSAccess().getGroup_8(), "rule__VerticalCRS__Group_8__0");
					put(grammarAccess.getVerticalCRSAccess().getGroup_9(), "rule__VerticalCRS__Group_9__0");
					put(grammarAccess.getVerticalCRSAccess().getGroup_10(), "rule__VerticalCRS__Group_10__0");
					put(grammarAccess.getEngineeringCRSAccess().getGroup(), "rule__EngineeringCRS__Group__0");
					put(grammarAccess.getEngineeringCRSAccess().getGroup_7(), "rule__EngineeringCRS__Group_7__0");
					put(grammarAccess.getEngineeringCRSAccess().getGroup_8(), "rule__EngineeringCRS__Group_8__0");
					put(grammarAccess.getEngineeringCRSAccess().getGroup_9(), "rule__EngineeringCRS__Group_9__0");
					put(grammarAccess.getEngineeringCRSAccess().getGroup_10(), "rule__EngineeringCRS__Group_10__0");
					put(grammarAccess.getProjectedCRSAccess().getGroup(), "rule__ProjectedCRS__Group__0");
					put(grammarAccess.getProjectedCRSAccess().getGroup_9(), "rule__ProjectedCRS__Group_9__0");
					put(grammarAccess.getProjectedCRSAccess().getGroup_10(), "rule__ProjectedCRS__Group_10__0");
					put(grammarAccess.getProjectedCRSAccess().getGroup_11(), "rule__ProjectedCRS__Group_11__0");
					put(grammarAccess.getProjectedCRSAccess().getGroup_12(), "rule__ProjectedCRS__Group_12__0");
					put(grammarAccess.getBaseGeodeticCRSAccess().getGroup(), "rule__BaseGeodeticCRS__Group__0");
					put(grammarAccess.getBaseGeodeticCRSAccess().getGroup_5(), "rule__BaseGeodeticCRS__Group_5__0");
					put(grammarAccess.getGeodeticDatumAccess().getGroup(), "rule__GeodeticDatum__Group__0");
					put(grammarAccess.getGeodeticDatumAccess().getGroup_5(), "rule__GeodeticDatum__Group_5__0");
					put(grammarAccess.getGeodeticDatumAccess().getGroup_7(), "rule__GeodeticDatum__Group_7__0");
					put(grammarAccess.getEngineeringDatumAccess().getGroup(), "rule__EngineeringDatum__Group__0");
					put(grammarAccess.getVerticalDatumAccess().getGroup(), "rule__VerticalDatum__Group__0");
					put(grammarAccess.getEllipsoidAccess().getGroup(), "rule__Ellipsoid__Group__0");
					put(grammarAccess.getEllipsoidAccess().getGroup_7(), "rule__Ellipsoid__Group_7__0");
					put(grammarAccess.getDatumAnchorAccess().getGroup(), "rule__DatumAnchor__Group__0");
					put(grammarAccess.getPrimeMeridianAccess().getGroup(), "rule__PrimeMeridian__Group__0");
					put(grammarAccess.getPrimeMeridianAccess().getGroup_5(), "rule__PrimeMeridian__Group_5__0");
					put(grammarAccess.getCoordinateSystemAccess().getGroup(), "rule__CoordinateSystem__Group__0");
					put(grammarAccess.getCoordinateSystemAccess().getGroup_6(), "rule__CoordinateSystem__Group_6__0");
					put(grammarAccess.getCoordinateSystemAccess().getGroup_7(), "rule__CoordinateSystem__Group_7__0");
					put(grammarAccess.getAxisAccess().getGroup(), "rule__Axis__Group__0");
					put(grammarAccess.getAxisAccess().getGroup_5(), "rule__Axis__Group_5__0");
					put(grammarAccess.getAxisAccess().getGroup_6(), "rule__Axis__Group_6__0");
					put(grammarAccess.getAxisOrderAccess().getGroup(), "rule__AxisOrder__Group__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_0(), "rule__AxisDirection__Group_0__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_0_2(), "rule__AxisDirection__Group_0_2__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_1(), "rule__AxisDirection__Group_1__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_2(), "rule__AxisDirection__Group_2__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_3(), "rule__AxisDirection__Group_3__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_4(), "rule__AxisDirection__Group_4__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_5(), "rule__AxisDirection__Group_5__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_6(), "rule__AxisDirection__Group_6__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_7(), "rule__AxisDirection__Group_7__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_7_2(), "rule__AxisDirection__Group_7_2__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_8(), "rule__AxisDirection__Group_8__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_9(), "rule__AxisDirection__Group_9__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_10(), "rule__AxisDirection__Group_10__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_11(), "rule__AxisDirection__Group_11__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_12(), "rule__AxisDirection__Group_12__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_13(), "rule__AxisDirection__Group_13__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_14(), "rule__AxisDirection__Group_14__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_15(), "rule__AxisDirection__Group_15__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_16(), "rule__AxisDirection__Group_16__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_17(), "rule__AxisDirection__Group_17__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_18(), "rule__AxisDirection__Group_18__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_19(), "rule__AxisDirection__Group_19__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_20(), "rule__AxisDirection__Group_20__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_21(), "rule__AxisDirection__Group_21__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_22(), "rule__AxisDirection__Group_22__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_23(), "rule__AxisDirection__Group_23__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_24(), "rule__AxisDirection__Group_24__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_25(), "rule__AxisDirection__Group_25__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_26(), "rule__AxisDirection__Group_26__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_27(), "rule__AxisDirection__Group_27__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_28(), "rule__AxisDirection__Group_28__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_29(), "rule__AxisDirection__Group_29__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_30(), "rule__AxisDirection__Group_30__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_31(), "rule__AxisDirection__Group_31__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_32(), "rule__AxisDirection__Group_32__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_33(), "rule__AxisDirection__Group_33__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_34(), "rule__AxisDirection__Group_34__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_35(), "rule__AxisDirection__Group_35__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_36(), "rule__AxisDirection__Group_36__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_37(), "rule__AxisDirection__Group_37__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_38(), "rule__AxisDirection__Group_38__0");
					put(grammarAccess.getAxisDirectionAccess().getGroup_39(), "rule__AxisDirection__Group_39__0");
					put(grammarAccess.getBearingAccess().getGroup(), "rule__Bearing__Group__0");
					put(grammarAccess.getCoordinateOperationAccess().getGroup(), "rule__CoordinateOperation__Group__0");
					put(grammarAccess.getCoordinateOperationAccess().getGroup_9(), "rule__CoordinateOperation__Group_9__0");
					put(grammarAccess.getCoordinateOperationAccess().getGroup_10(), "rule__CoordinateOperation__Group_10__0");
					put(grammarAccess.getCoordinateOperationAccess().getGroup_11(), "rule__CoordinateOperation__Group_11__0");
					put(grammarAccess.getCoordinateOperationAccess().getGroup_12(), "rule__CoordinateOperation__Group_12__0");
					put(grammarAccess.getConversionAccess().getGroup(), "rule__Conversion__Group__0");
					put(grammarAccess.getConversionAccess().getGroup_5(), "rule__Conversion__Group_5__0");
					put(grammarAccess.getOperationMethodAccess().getGroup(), "rule__OperationMethod__Group__0");
					put(grammarAccess.getProjectionParameterAccess().getGroup(), "rule__ProjectionParameter__Group__0");
					put(grammarAccess.getProjectionParameterAccess().getGroup_5(), "rule__ProjectionParameter__Group_5__0");
					put(grammarAccess.getSourceCRSAccess().getGroup(), "rule__SourceCRS__Group__0");
					put(grammarAccess.getTargetCRSAccess().getGroup(), "rule__TargetCRS__Group__0");
					put(grammarAccess.getLengthUnitAccess().getGroup(), "rule__LengthUnit__Group__0");
					put(grammarAccess.getAngleUnitAccess().getGroup(), "rule__AngleUnit__Group__0");
					put(grammarAccess.getScaleUnitAccess().getGroup(), "rule__ScaleUnit__Group__0");
					put(grammarAccess.getParametricUnitAccess().getGroup(), "rule__ParametricUnit__Group__0");
					put(grammarAccess.getTimeUnitAccess().getGroup(), "rule__TimeUnit__Group__0");
					put(grammarAccess.getWKTAccess().getWktAssignment_0(), "rule__WKT__WktAssignment_0");
					put(grammarAccess.getScopeAccess().getScopeAssignment_2(), "rule__Scope__ScopeAssignment_2");
					put(grammarAccess.getAreaDescriptionAccess().getAreaDescriptionAssignment_2(), "rule__AreaDescription__AreaDescriptionAssignment_2");
					put(grammarAccess.getGeographicBoundingBoxAccess().getLowerLeftLatitudeAssignment_2(), "rule__GeographicBoundingBox__LowerLeftLatitudeAssignment_2");
					put(grammarAccess.getGeographicBoundingBoxAccess().getLowerLeftLongitudeAssignment_4(), "rule__GeographicBoundingBox__LowerLeftLongitudeAssignment_4");
					put(grammarAccess.getGeographicBoundingBoxAccess().getUpperRightLatitudeAssignment_6(), "rule__GeographicBoundingBox__UpperRightLatitudeAssignment_6");
					put(grammarAccess.getGeographicBoundingBoxAccess().getUpperRightLongitudeAssignment_8(), "rule__GeographicBoundingBox__UpperRightLongitudeAssignment_8");
					put(grammarAccess.getVerticalExtentAccess().getMinimumHeightAssignment_2(), "rule__VerticalExtent__MinimumHeightAssignment_2");
					put(grammarAccess.getVerticalExtentAccess().getMaximumHeightAssignment_4(), "rule__VerticalExtent__MaximumHeightAssignment_4");
					put(grammarAccess.getVerticalExtentAccess().getLenghtUnitAssignment_5_1(), "rule__VerticalExtent__LenghtUnitAssignment_5_1");
					put(grammarAccess.getIdentifierAccess().getAuthorityAssignment_2(), "rule__Identifier__AuthorityAssignment_2");
					put(grammarAccess.getIdentifierAccess().getUniqueIdentifierTextAssignment_4_0(), "rule__Identifier__UniqueIdentifierTextAssignment_4_0");
					put(grammarAccess.getIdentifierAccess().getUniqueIdentifierNrAssignment_4_1(), "rule__Identifier__UniqueIdentifierNrAssignment_4_1");
					put(grammarAccess.getIdentifierAccess().getVersionTextAssignment_5_1_0(), "rule__Identifier__VersionTextAssignment_5_1_0");
					put(grammarAccess.getIdentifierAccess().getVersionNrAssignment_5_1_1(), "rule__Identifier__VersionNrAssignment_5_1_1");
					put(grammarAccess.getIdentifierAccess().getCitationAssignment_6_1(), "rule__Identifier__CitationAssignment_6_1");
					put(grammarAccess.getIdentifierAccess().getUriAssignment_7_1(), "rule__Identifier__UriAssignment_7_1");
					put(grammarAccess.getCitationAccess().getCitationAssignment_2(), "rule__Citation__CitationAssignment_2");
					put(grammarAccess.getURIAccess().getUriAssignment_2(), "rule__URI__UriAssignment_2");
					put(grammarAccess.getRemarkAccess().getRemarkAssignment_2(), "rule__Remark__RemarkAssignment_2");
					put(grammarAccess.getGeodeticCRSAccess().getNameAssignment_2(), "rule__GeodeticCRS__NameAssignment_2");
					put(grammarAccess.getGeodeticCRSAccess().getDatumAssignment_4(), "rule__GeodeticCRS__DatumAssignment_4");
					put(grammarAccess.getGeodeticCRSAccess().getCoordinateSystemAssignment_6(), "rule__GeodeticCRS__CoordinateSystemAssignment_6");
					put(grammarAccess.getGeodeticCRSAccess().getScopeAssignment_7_1(), "rule__GeodeticCRS__ScopeAssignment_7_1");
					put(grammarAccess.getGeodeticCRSAccess().getExtentAssignment_8_1(), "rule__GeodeticCRS__ExtentAssignment_8_1");
					put(grammarAccess.getGeodeticCRSAccess().getIdentifierAssignment_9_1(), "rule__GeodeticCRS__IdentifierAssignment_9_1");
					put(grammarAccess.getGeodeticCRSAccess().getRemarkAssignment_10_1(), "rule__GeodeticCRS__RemarkAssignment_10_1");
					put(grammarAccess.getVerticalCRSAccess().getNameAssignment_2(), "rule__VerticalCRS__NameAssignment_2");
					put(grammarAccess.getVerticalCRSAccess().getDatumAssignment_4(), "rule__VerticalCRS__DatumAssignment_4");
					put(grammarAccess.getVerticalCRSAccess().getCoordinateSystemAssignment_6(), "rule__VerticalCRS__CoordinateSystemAssignment_6");
					put(grammarAccess.getVerticalCRSAccess().getScopeAssignment_7_1(), "rule__VerticalCRS__ScopeAssignment_7_1");
					put(grammarAccess.getVerticalCRSAccess().getExtentAssignment_8_1(), "rule__VerticalCRS__ExtentAssignment_8_1");
					put(grammarAccess.getVerticalCRSAccess().getIdentifierAssignment_9_1(), "rule__VerticalCRS__IdentifierAssignment_9_1");
					put(grammarAccess.getVerticalCRSAccess().getRemarkAssignment_10_1(), "rule__VerticalCRS__RemarkAssignment_10_1");
					put(grammarAccess.getEngineeringCRSAccess().getNameAssignment_2(), "rule__EngineeringCRS__NameAssignment_2");
					put(grammarAccess.getEngineeringCRSAccess().getDatumAssignment_4(), "rule__EngineeringCRS__DatumAssignment_4");
					put(grammarAccess.getEngineeringCRSAccess().getCoordinateSystemAssignment_6(), "rule__EngineeringCRS__CoordinateSystemAssignment_6");
					put(grammarAccess.getEngineeringCRSAccess().getScopeAssignment_7_1(), "rule__EngineeringCRS__ScopeAssignment_7_1");
					put(grammarAccess.getEngineeringCRSAccess().getExtentAssignment_8_1(), "rule__EngineeringCRS__ExtentAssignment_8_1");
					put(grammarAccess.getEngineeringCRSAccess().getIdentifierAssignment_9_1(), "rule__EngineeringCRS__IdentifierAssignment_9_1");
					put(grammarAccess.getEngineeringCRSAccess().getRemarkAssignment_10_1(), "rule__EngineeringCRS__RemarkAssignment_10_1");
					put(grammarAccess.getProjectedCRSAccess().getNameAssignment_2(), "rule__ProjectedCRS__NameAssignment_2");
					put(grammarAccess.getProjectedCRSAccess().getBaseCRSAssignment_4(), "rule__ProjectedCRS__BaseCRSAssignment_4");
					put(grammarAccess.getProjectedCRSAccess().getOperationAssignment_6(), "rule__ProjectedCRS__OperationAssignment_6");
					put(grammarAccess.getProjectedCRSAccess().getCoordinateSystemAssignment_8(), "rule__ProjectedCRS__CoordinateSystemAssignment_8");
					put(grammarAccess.getProjectedCRSAccess().getScopeAssignment_9_1(), "rule__ProjectedCRS__ScopeAssignment_9_1");
					put(grammarAccess.getProjectedCRSAccess().getExtentAssignment_10_1(), "rule__ProjectedCRS__ExtentAssignment_10_1");
					put(grammarAccess.getProjectedCRSAccess().getIdentifierAssignment_11_1(), "rule__ProjectedCRS__IdentifierAssignment_11_1");
					put(grammarAccess.getProjectedCRSAccess().getRemarkAssignment_12_1(), "rule__ProjectedCRS__RemarkAssignment_12_1");
					put(grammarAccess.getBaseGeodeticCRSAccess().getNameAssignment_2(), "rule__BaseGeodeticCRS__NameAssignment_2");
					put(grammarAccess.getBaseGeodeticCRSAccess().getDatumAssignment_4(), "rule__BaseGeodeticCRS__DatumAssignment_4");
					put(grammarAccess.getBaseGeodeticCRSAccess().getEllipsoidalCoordinateSystemUnitAssignment_5_1(), "rule__BaseGeodeticCRS__EllipsoidalCoordinateSystemUnitAssignment_5_1");
					put(grammarAccess.getGeodeticDatumAccess().getNameAssignment_2(), "rule__GeodeticDatum__NameAssignment_2");
					put(grammarAccess.getGeodeticDatumAccess().getEllipsoidAssignment_4(), "rule__GeodeticDatum__EllipsoidAssignment_4");
					put(grammarAccess.getGeodeticDatumAccess().getDatumAnchorAssignment_5_1(), "rule__GeodeticDatum__DatumAnchorAssignment_5_1");
					put(grammarAccess.getGeodeticDatumAccess().getPrimeMeridianAssignment_7_1(), "rule__GeodeticDatum__PrimeMeridianAssignment_7_1");
					put(grammarAccess.getEngineeringDatumAccess().getNameAssignment_2(), "rule__EngineeringDatum__NameAssignment_2");
					put(grammarAccess.getVerticalDatumAccess().getNameAssignment_2(), "rule__VerticalDatum__NameAssignment_2");
					put(grammarAccess.getEllipsoidAccess().getNameAssignment_2(), "rule__Ellipsoid__NameAssignment_2");
					put(grammarAccess.getEllipsoidAccess().getSemiMajorAxisAssignment_4(), "rule__Ellipsoid__SemiMajorAxisAssignment_4");
					put(grammarAccess.getEllipsoidAccess().getInverseFlatteningAssignment_6(), "rule__Ellipsoid__InverseFlatteningAssignment_6");
					put(grammarAccess.getEllipsoidAccess().getLengthUnitAssignment_7_1(), "rule__Ellipsoid__LengthUnitAssignment_7_1");
					put(grammarAccess.getDatumAnchorAccess().getAnchorDescriptionAssignment_2(), "rule__DatumAnchor__AnchorDescriptionAssignment_2");
					put(grammarAccess.getPrimeMeridianAccess().getNameAssignment_2(), "rule__PrimeMeridian__NameAssignment_2");
					put(grammarAccess.getPrimeMeridianAccess().getIrmLongitudeAssignment_4(), "rule__PrimeMeridian__IrmLongitudeAssignment_4");
					put(grammarAccess.getPrimeMeridianAccess().getAngleUnitAssignment_5_1(), "rule__PrimeMeridian__AngleUnitAssignment_5_1");
					put(grammarAccess.getCoordinateSystemAccess().getTypeAssignment_2(), "rule__CoordinateSystem__TypeAssignment_2");
					put(grammarAccess.getCoordinateSystemAccess().getDimensionAssignment_4(), "rule__CoordinateSystem__DimensionAssignment_4");
					put(grammarAccess.getCoordinateSystemAccess().getAxisAssignment_6_1(), "rule__CoordinateSystem__AxisAssignment_6_1");
					put(grammarAccess.getCoordinateSystemAccess().getCsUnitAssignment_7_1(), "rule__CoordinateSystem__CsUnitAssignment_7_1");
					put(grammarAccess.getAxisAccess().getNameAssignment_2(), "rule__Axis__NameAssignment_2");
					put(grammarAccess.getAxisAccess().getDirectionAssignment_4(), "rule__Axis__DirectionAssignment_4");
					put(grammarAccess.getAxisAccess().getOrderAssignment_5_1(), "rule__Axis__OrderAssignment_5_1");
					put(grammarAccess.getAxisAccess().getUnitAssignment_6_1(), "rule__Axis__UnitAssignment_6_1");
					put(grammarAccess.getAxisOrderAccess().getIndexAssignment_2(), "rule__AxisOrder__IndexAssignment_2");
					put(grammarAccess.getAxisDirectionAccess().getMeridianAssignment_0_2_1(), "rule__AxisDirection__MeridianAssignment_0_2_1");
					put(grammarAccess.getAxisDirectionAccess().getMeridianAssignment_7_2_1(), "rule__AxisDirection__MeridianAssignment_7_2_1");
					put(grammarAccess.getAxisDirectionAccess().getBearingAssignment_24_3(), "rule__AxisDirection__BearingAssignment_24_3");
					put(grammarAccess.getAxisDirectionAccess().getBearingAssignment_25_3(), "rule__AxisDirection__BearingAssignment_25_3");
					put(grammarAccess.getBearingAccess().getBearingAssignment_2(), "rule__Bearing__BearingAssignment_2");
					put(grammarAccess.getCoordinateOperationAccess().getNameAssignment_2(), "rule__CoordinateOperation__NameAssignment_2");
					put(grammarAccess.getCoordinateOperationAccess().getSourceAssignment_4(), "rule__CoordinateOperation__SourceAssignment_4");
					put(grammarAccess.getCoordinateOperationAccess().getTargetAssignment_6(), "rule__CoordinateOperation__TargetAssignment_6");
					put(grammarAccess.getCoordinateOperationAccess().getMethodAssignment_8(), "rule__CoordinateOperation__MethodAssignment_8");
					put(grammarAccess.getCoordinateOperationAccess().getScopeAssignment_9_1(), "rule__CoordinateOperation__ScopeAssignment_9_1");
					put(grammarAccess.getCoordinateOperationAccess().getExtentAssignment_10_1(), "rule__CoordinateOperation__ExtentAssignment_10_1");
					put(grammarAccess.getCoordinateOperationAccess().getIdentifierAssignment_11_1(), "rule__CoordinateOperation__IdentifierAssignment_11_1");
					put(grammarAccess.getCoordinateOperationAccess().getRemarkAssignment_12_1(), "rule__CoordinateOperation__RemarkAssignment_12_1");
					put(grammarAccess.getConversionAccess().getNameAssignment_2(), "rule__Conversion__NameAssignment_2");
					put(grammarAccess.getConversionAccess().getMethodAssignment_4(), "rule__Conversion__MethodAssignment_4");
					put(grammarAccess.getConversionAccess().getParametersAssignment_5_1(), "rule__Conversion__ParametersAssignment_5_1");
					put(grammarAccess.getOperationMethodAccess().getNameAssignment_2(), "rule__OperationMethod__NameAssignment_2");
					put(grammarAccess.getProjectionParameterAccess().getNameAssignment_2(), "rule__ProjectionParameter__NameAssignment_2");
					put(grammarAccess.getProjectionParameterAccess().getValueAssignment_4(), "rule__ProjectionParameter__ValueAssignment_4");
					put(grammarAccess.getProjectionParameterAccess().getUnitAssignment_5_1(), "rule__ProjectionParameter__UnitAssignment_5_1");
					put(grammarAccess.getSourceCRSAccess().getCrsAssignment_2(), "rule__SourceCRS__CrsAssignment_2");
					put(grammarAccess.getTargetCRSAccess().getCrsAssignment_2(), "rule__TargetCRS__CrsAssignment_2");
					put(grammarAccess.getLengthUnitAccess().getNameAssignment_2(), "rule__LengthUnit__NameAssignment_2");
					put(grammarAccess.getLengthUnitAccess().getFactorAssignment_4(), "rule__LengthUnit__FactorAssignment_4");
					put(grammarAccess.getAngleUnitAccess().getNameAssignment_2(), "rule__AngleUnit__NameAssignment_2");
					put(grammarAccess.getAngleUnitAccess().getFactorAssignment_4(), "rule__AngleUnit__FactorAssignment_4");
					put(grammarAccess.getScaleUnitAccess().getNameAssignment_2(), "rule__ScaleUnit__NameAssignment_2");
					put(grammarAccess.getScaleUnitAccess().getFactorAssignment_4(), "rule__ScaleUnit__FactorAssignment_4");
					put(grammarAccess.getParametricUnitAccess().getNameAssignment_2(), "rule__ParametricUnit__NameAssignment_2");
					put(grammarAccess.getParametricUnitAccess().getFactorAssignment_4(), "rule__ParametricUnit__FactorAssignment_4");
					put(grammarAccess.getTimeUnitAccess().getNameAssignment_2(), "rule__TimeUnit__NameAssignment_2");
					put(grammarAccess.getTimeUnitAccess().getFactorAssignment_4(), "rule__TimeUnit__FactorAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalWellKnownTextParser typedParser = (InternalWellKnownTextParser) parser;
			typedParser.entryRuleWKT();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] {  };
	}

	public WellKnownTextGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(WellKnownTextGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

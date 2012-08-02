package it.rcpvision.emf.components.dsl.serializer;

import com.google.inject.Inject;
import it.rcpvision.emf.components.dsl.services.EmfComponentsDslGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class EmfComponentsDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected EmfComponentsDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_FeaturesProvider___FeaturesKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q;
	protected AbstractElementAlias match_FormFeatureControlFactory___ControlsKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q;
	protected AbstractElementAlias match_LabelProvider___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3__a__a;
	protected AbstractElementAlias match_LabelProvider___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__a;
	protected AbstractElementAlias match_LabelProvider___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1___RightCurlyBracketKeyword_3_1_3_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1__a___or_____ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1___RightCurlyBracketKeyword_3_1_3_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1__a_RightCurlyBracketKeyword_3_1_3__q___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3__p_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1___RightCurlyBracketKeyword_3_1_3_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1__a___RightCurlyBracketKeyword_3_1_3___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3__p_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1___RightCurlyBracketKeyword_3_1_3_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1__a__a__;
	protected AbstractElementAlias match_LabelProvider___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__a__a;
	protected AbstractElementAlias match_LabelProvider___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3__a;
	protected AbstractElementAlias match_LabelProvider___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1___RightCurlyBracketKeyword_3_0_3_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__a___or_____LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1___RightCurlyBracketKeyword_3_0_3_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__a_RightCurlyBracketKeyword_3_0_3__q___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__p_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1___RightCurlyBracketKeyword_3_0_3_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__a___RightCurlyBracketKeyword_3_0_3___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__p_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1___RightCurlyBracketKeyword_3_0_3_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__a__a__;
	protected AbstractElementAlias match_LabelProvider___RightCurlyBracketKeyword_3_0_3___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__a_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__a;
	protected AbstractElementAlias match_LabelProvider___RightCurlyBracketKeyword_3_1_3___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3__a_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1__a;
	protected AbstractElementAlias match_LabelProvider_____ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3___or___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3____a;
	protected AbstractElementAlias match_PropertyDescriptionProvider___LabelsKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q;
	protected AbstractElementAlias match_XBlockExpression_SemicolonKeyword_2_1_q;
	protected AbstractElementAlias match_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q;
	protected AbstractElementAlias match_XExpressionInClosure_SemicolonKeyword_1_1_q;
	protected AbstractElementAlias match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q;
	protected AbstractElementAlias match_XParenthesizedExpression_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_XParenthesizedExpression_LeftParenthesisKeyword_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (EmfComponentsDslGrammarAccess) access;
		match_FeaturesProvider___FeaturesKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFeaturesProviderAccess().getFeaturesKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getFeaturesProviderAccess().getLeftCurlyBracketKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getFeaturesProviderAccess().getRightCurlyBracketKeyword_3_3()));
		match_FormFeatureControlFactory___ControlsKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFormFeatureControlFactoryAccess().getControlsKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getFormFeatureControlFactoryAccess().getLeftCurlyBracketKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getFormFeatureControlFactoryAccess().getRightCurlyBracketKeyword_3_3()));
		match_LabelProvider___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3__a__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getImagesKeyword_3_1_0()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLeftCurlyBracketKeyword_3_1_1()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getRightCurlyBracketKeyword_3_1_3()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLabelsKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLeftCurlyBracketKeyword_3_0_1()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getRightCurlyBracketKeyword_3_0_3())));
		match_LabelProvider___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getImagesKeyword_3_1_0()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLeftCurlyBracketKeyword_3_1_1()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getRightCurlyBracketKeyword_3_1_3()));
		match_LabelProvider___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1___RightCurlyBracketKeyword_3_1_3_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1__a___or_____ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1___RightCurlyBracketKeyword_3_1_3_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1__a_RightCurlyBracketKeyword_3_1_3__q___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3__p_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1___RightCurlyBracketKeyword_3_1_3_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1__a___RightCurlyBracketKeyword_3_1_3___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3__p_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1___RightCurlyBracketKeyword_3_1_3_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1__a__a__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getImagesKeyword_3_1_0()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLeftCurlyBracketKeyword_3_1_1()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getRightCurlyBracketKeyword_3_1_3()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getImagesKeyword_3_1_0()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLeftCurlyBracketKeyword_3_1_1())), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getRightCurlyBracketKeyword_3_1_3())), new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLabelsKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLeftCurlyBracketKeyword_3_0_1()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getRightCurlyBracketKeyword_3_0_3())), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getImagesKeyword_3_1_0()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLeftCurlyBracketKeyword_3_1_1()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getRightCurlyBracketKeyword_3_1_3()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getImagesKeyword_3_1_0()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLeftCurlyBracketKeyword_3_1_1())), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getRightCurlyBracketKeyword_3_1_3()), new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLabelsKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLeftCurlyBracketKeyword_3_0_1()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getRightCurlyBracketKeyword_3_0_3())), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getImagesKeyword_3_1_0()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLeftCurlyBracketKeyword_3_1_1()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getRightCurlyBracketKeyword_3_1_3()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getImagesKeyword_3_1_0()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLeftCurlyBracketKeyword_3_1_1())))), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getImagesKeyword_3_1_0()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLeftCurlyBracketKeyword_3_1_1()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getRightCurlyBracketKeyword_3_1_3()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getImagesKeyword_3_1_0()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLeftCurlyBracketKeyword_3_1_1()))));
		match_LabelProvider___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__a__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLabelsKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLeftCurlyBracketKeyword_3_0_1()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getRightCurlyBracketKeyword_3_0_3()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getImagesKeyword_3_1_0()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLeftCurlyBracketKeyword_3_1_1()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getRightCurlyBracketKeyword_3_1_3())));
		match_LabelProvider___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLabelsKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLeftCurlyBracketKeyword_3_0_1()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getRightCurlyBracketKeyword_3_0_3()));
		match_LabelProvider___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1___RightCurlyBracketKeyword_3_0_3_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__a___or_____LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1___RightCurlyBracketKeyword_3_0_3_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__a_RightCurlyBracketKeyword_3_0_3__q___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__p_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1___RightCurlyBracketKeyword_3_0_3_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__a___RightCurlyBracketKeyword_3_0_3___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__p_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1___RightCurlyBracketKeyword_3_0_3_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__a__a__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLabelsKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLeftCurlyBracketKeyword_3_0_1()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getRightCurlyBracketKeyword_3_0_3()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLabelsKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLeftCurlyBracketKeyword_3_0_1())), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getRightCurlyBracketKeyword_3_0_3())), new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getImagesKeyword_3_1_0()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLeftCurlyBracketKeyword_3_1_1()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getRightCurlyBracketKeyword_3_1_3())), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLabelsKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLeftCurlyBracketKeyword_3_0_1()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getRightCurlyBracketKeyword_3_0_3()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLabelsKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLeftCurlyBracketKeyword_3_0_1())), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getRightCurlyBracketKeyword_3_0_3()), new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getImagesKeyword_3_1_0()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLeftCurlyBracketKeyword_3_1_1()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getRightCurlyBracketKeyword_3_1_3())), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLabelsKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLeftCurlyBracketKeyword_3_0_1()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getRightCurlyBracketKeyword_3_0_3()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLabelsKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLeftCurlyBracketKeyword_3_0_1())))), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLabelsKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLeftCurlyBracketKeyword_3_0_1()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getRightCurlyBracketKeyword_3_0_3()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLabelsKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLeftCurlyBracketKeyword_3_0_1()))));
		match_LabelProvider___RightCurlyBracketKeyword_3_0_3___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__a_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getRightCurlyBracketKeyword_3_0_3()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getImagesKeyword_3_1_0()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLeftCurlyBracketKeyword_3_1_1()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getRightCurlyBracketKeyword_3_1_3())), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLabelsKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLeftCurlyBracketKeyword_3_0_1()));
		match_LabelProvider___RightCurlyBracketKeyword_3_1_3___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3__a_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getRightCurlyBracketKeyword_3_1_3()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLabelsKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLeftCurlyBracketKeyword_3_0_1()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getRightCurlyBracketKeyword_3_0_3())), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getImagesKeyword_3_1_0()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLeftCurlyBracketKeyword_3_1_1()));
		match_LabelProvider_____ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3___or___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3____a = new AlternativeAlias(true, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getImagesKeyword_3_1_0()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLeftCurlyBracketKeyword_3_1_1()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getRightCurlyBracketKeyword_3_1_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLabelsKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getLeftCurlyBracketKeyword_3_0_1()), new TokenAlias(false, false, grammarAccess.getLabelProviderAccess().getRightCurlyBracketKeyword_3_0_3())));
		match_PropertyDescriptionProvider___LabelsKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPropertyDescriptionProviderAccess().getLabelsKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getPropertyDescriptionProviderAccess().getLeftCurlyBracketKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getPropertyDescriptionProviderAccess().getRightCurlyBracketKeyword_3_3()));
		match_XBlockExpression_SemicolonKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
		match_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2()));
		match_XExpressionInClosure_SemicolonKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
		match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2()));
		match_XParenthesizedExpression_LeftParenthesisKeyword_0_a = new TokenAlias(true, true, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_XParenthesizedExpression_LeftParenthesisKeyword_0_p = new TokenAlias(true, false, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getOpSingleAssignRule())
			return getOpSingleAssignToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * OpSingleAssign:
	 * 	'='
	 * ;
	 */
	protected String getOpSingleAssignToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_FeaturesProvider___FeaturesKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q.equals(syntax))
				emit_FeaturesProvider___FeaturesKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FormFeatureControlFactory___ControlsKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q.equals(syntax))
				emit_FormFeatureControlFactory___ControlsKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LabelProvider___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3__a__a.equals(syntax))
				emit_LabelProvider___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3__a__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LabelProvider___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__a.equals(syntax))
				emit_LabelProvider___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LabelProvider___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1___RightCurlyBracketKeyword_3_1_3_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1__a___or_____ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1___RightCurlyBracketKeyword_3_1_3_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1__a_RightCurlyBracketKeyword_3_1_3__q___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3__p_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1___RightCurlyBracketKeyword_3_1_3_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1__a___RightCurlyBracketKeyword_3_1_3___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3__p_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1___RightCurlyBracketKeyword_3_1_3_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1__a__a__.equals(syntax))
				emit_LabelProvider___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1___RightCurlyBracketKeyword_3_1_3_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1__a___or_____ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1___RightCurlyBracketKeyword_3_1_3_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1__a_RightCurlyBracketKeyword_3_1_3__q___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3__p_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1___RightCurlyBracketKeyword_3_1_3_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1__a___RightCurlyBracketKeyword_3_1_3___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3__p_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1___RightCurlyBracketKeyword_3_1_3_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1__a__a__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LabelProvider___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__a__a.equals(syntax))
				emit_LabelProvider___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__a__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LabelProvider___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3__a.equals(syntax))
				emit_LabelProvider___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LabelProvider___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1___RightCurlyBracketKeyword_3_0_3_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__a___or_____LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1___RightCurlyBracketKeyword_3_0_3_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__a_RightCurlyBracketKeyword_3_0_3__q___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__p_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1___RightCurlyBracketKeyword_3_0_3_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__a___RightCurlyBracketKeyword_3_0_3___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__p_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1___RightCurlyBracketKeyword_3_0_3_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__a__a__.equals(syntax))
				emit_LabelProvider___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1___RightCurlyBracketKeyword_3_0_3_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__a___or_____LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1___RightCurlyBracketKeyword_3_0_3_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__a_RightCurlyBracketKeyword_3_0_3__q___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__p_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1___RightCurlyBracketKeyword_3_0_3_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__a___RightCurlyBracketKeyword_3_0_3___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__p_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1___RightCurlyBracketKeyword_3_0_3_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__a__a__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LabelProvider___RightCurlyBracketKeyword_3_0_3___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__a_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__a.equals(syntax))
				emit_LabelProvider___RightCurlyBracketKeyword_3_0_3___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__a_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LabelProvider___RightCurlyBracketKeyword_3_1_3___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3__a_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1__a.equals(syntax))
				emit_LabelProvider___RightCurlyBracketKeyword_3_1_3___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3__a_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LabelProvider_____ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3___or___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3____a.equals(syntax))
				emit_LabelProvider_____ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3___or___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3____a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PropertyDescriptionProvider___LabelsKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q.equals(syntax))
				emit_PropertyDescriptionProvider___LabelsKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XBlockExpression_SemicolonKeyword_2_1_q.equals(syntax))
				emit_XBlockExpression_SemicolonKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q.equals(syntax))
				emit_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XExpressionInClosure_SemicolonKeyword_1_1_q.equals(syntax))
				emit_XExpressionInClosure_SemicolonKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q.equals(syntax))
				emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XParenthesizedExpression_LeftParenthesisKeyword_0_a.equals(syntax))
				emit_XParenthesizedExpression_LeftParenthesisKeyword_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XParenthesizedExpression_LeftParenthesisKeyword_0_p.equals(syntax))
				emit_XParenthesizedExpression_LeftParenthesisKeyword_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('features' '{' '}')?
	 */
	protected void emit_FeaturesProvider___FeaturesKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('controls' '{' '}')?
	 */
	protected void emit_FormFeatureControlFactory___ControlsKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('images' '{' '}' ('labels' '{' '}')*)*
	 */
	protected void emit_LabelProvider___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3__a__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('images' '{' '}')*
	 */
	protected void emit_LabelProvider___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     (
	         ('images' '{' ('}' 'images' '{')* '}')? 
	         ('labels' '{' '}')+ 
	         'images' 
	         '{' 
	         ('}' 'images' '{')* 
	         ('}' ('labels' '{' '}')+ 'images' '{' ('}' 'images' '{')*)*
	     ) | 
	     ('images' '{' ('}' 'images' '{')*)
	 )
	 */
	protected void emit_LabelProvider___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1___RightCurlyBracketKeyword_3_1_3_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1__a___or_____ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1___RightCurlyBracketKeyword_3_1_3_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1__a_RightCurlyBracketKeyword_3_1_3__q___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3__p_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1___RightCurlyBracketKeyword_3_1_3_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1__a___RightCurlyBracketKeyword_3_1_3___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3__p_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1___RightCurlyBracketKeyword_3_1_3_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1__a__a__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('labels' '{' '}' ('images' '{' '}')*)*
	 */
	protected void emit_LabelProvider___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__a__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('labels' '{' '}')*
	 */
	protected void emit_LabelProvider___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     (
	         ('labels' '{' ('}' 'labels' '{')* '}')? 
	         ('images' '{' '}')+ 
	         'labels' 
	         '{' 
	         ('}' 'labels' '{')* 
	         ('}' ('images' '{' '}')+ 'labels' '{' ('}' 'labels' '{')*)*
	     ) | 
	     ('labels' '{' ('}' 'labels' '{')*)
	 )
	 */
	protected void emit_LabelProvider___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1___RightCurlyBracketKeyword_3_0_3_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__a___or_____LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1___RightCurlyBracketKeyword_3_0_3_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__a_RightCurlyBracketKeyword_3_0_3__q___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__p_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1___RightCurlyBracketKeyword_3_0_3_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__a___RightCurlyBracketKeyword_3_0_3___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__p_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1___RightCurlyBracketKeyword_3_0_3_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__a__a__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' ('images' '{' '}')* 'labels' '{')*
	 */
	protected void emit_LabelProvider___RightCurlyBracketKeyword_3_0_3___ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__a_LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' ('labels' '{' '}')* 'images' '{')*
	 */
	protected void emit_LabelProvider___RightCurlyBracketKeyword_3_1_3___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3__a_ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (('labels' '{' '}') | ('images' '{' '}'))*
	 */
	protected void emit_LabelProvider_____ImagesKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3___or___LabelsKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_RightCurlyBracketKeyword_3_0_3____a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('labels' '{' '}')?
	 */
	protected void emit_PropertyDescriptionProvider___LabelsKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_XBlockExpression_SemicolonKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_XExpressionInClosure_SemicolonKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_XParenthesizedExpression_LeftParenthesisKeyword_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_XParenthesizedExpression_LeftParenthesisKeyword_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}

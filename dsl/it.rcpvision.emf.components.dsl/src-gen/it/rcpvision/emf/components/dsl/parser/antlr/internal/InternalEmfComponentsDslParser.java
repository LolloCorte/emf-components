package it.rcpvision.emf.components.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import it.rcpvision.emf.components.dsl.services.EmfComponentsDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEmfComponentsDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'module'", "'{'", "'}'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'=>'", "'<>'", "'?:'", "'<=>'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'.'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "':'", "'default'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'?'", "'extends'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=8;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int RULE_HEX=5;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int RULE_DECIMAL=7;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalEmfComponentsDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEmfComponentsDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEmfComponentsDslParser.tokenNames; }
    public String getGrammarFileName() { return "../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g"; }



     	private EmfComponentsDslGrammarAccess grammarAccess;
     	
        public InternalEmfComponentsDslParser(TokenStream input, EmfComponentsDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected EmfComponentsDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:69:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_module_1_0= ruleModule ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_module_1_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_module_1_0= ruleModule ) ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_module_1_0= ruleModule ) ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_module_1_0= ruleModule ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:80:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_module_1_0= ruleModule ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:80:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:81:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:81:1: (lv_imports_0_0= ruleImport )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:82:3: lv_imports_0_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleModel131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_0_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:98:3: ( (lv_module_1_0= ruleModule ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:99:1: (lv_module_1_0= ruleModule )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:99:1: (lv_module_1_0= ruleModule )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:100:3: lv_module_1_0= ruleModule
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getModuleModuleParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleModule_in_ruleModel153);
            lv_module_1_0=ruleModule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelRule());
              	        }
                     		set(
                     			current, 
                     			"module",
                      		lv_module_1_0, 
                      		"Module");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:124:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:125:2: (iv_ruleImport= ruleImport EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:126:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport189);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport199); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:133:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:136:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:137:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:137:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:137:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleImport236); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:141:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:142:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:142:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:143:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport257);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildcard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:167:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:168:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:169:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard294);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard305); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:176:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:179:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:180:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:180:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:181:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard352);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:191:1: (kw= '.*' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:192:2: kw= '.*'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedNameWithWildcard371); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleModule"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:205:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:206:2: (iv_ruleModule= ruleModule EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:207:2: iv_ruleModule= ruleModule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModuleRule()); 
            }
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule413);
            iv_ruleModule=ruleModule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule423); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:214:1: ruleModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:217:28: ( (otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:218:1: (otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:218:1: (otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' otherlv_3= '}' )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:218:3: otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleModule460); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getModuleKeyword_0());
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:222:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:223:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:223:1: (lv_name_1_0= ruleQualifiedName )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:224:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModuleAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleModule481);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModuleRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleModule493); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleModule505); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleXExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:256:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:257:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:258:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression541);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression551); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:265:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:268:28: (this_XAssignment_0= ruleXAssignment )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:270:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression597);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAssignment_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:286:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:287:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:288:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment631);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment641); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:295:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:298:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:299:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:299:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==18) ) {
                    alt4=1;
                }
                else if ( (LA4_1==EOF||(LA4_1>=RULE_STRING && LA4_1<=RULE_ID)||(LA4_1>=16 && LA4_1<=17)||(LA4_1>=19 && LA4_1<=49)||(LA4_1>=51 && LA4_1<=75)) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_DECIMAL)||LA4_0==16||LA4_0==28||(LA4_0>=35 && LA4_0<=36)||LA4_0==41||LA4_0==47||LA4_0==49||LA4_0==53||LA4_0==55||(LA4_0>=59 && LA4_0<=61)||LA4_0==64||(LA4_0>=66 && LA4_0<=73)) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:299:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:299:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:299:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:299:3: ()
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:300:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:305:2: ( ( ruleValidID ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:306:1: ( ruleValidID )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:306:1: ( ruleValidID )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:307:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment699);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment715);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:328:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:329:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:329:1: (lv_value_3_0= ruleXAssignment )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:330:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment735);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:347:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:347:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:348:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment765);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:356:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==19) ) {
                        int LA3_1 = input.LA(2);

                        if ( (synpred1_InternalEmfComponentsDsl()) ) {
                            alt3=1;
                        }
                    }
                    switch (alt3) {
                        case 1 :
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:356:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:356:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:356:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:361:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:361:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:361:7: ()
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:362:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:367:2: ( ( ruleOpMultiAssign ) )
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:368:1: ( ruleOpMultiAssign )
                            {
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:368:1: ( ruleOpMultiAssign )
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:369:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment818);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:382:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:383:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:383:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:384:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment841);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightOperand",
                                      		lv_rightOperand_7_0, 
                                      		"XAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:408:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:409:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:410:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign881);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign892); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:417:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:420:28: (kw= '=' )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:422:2: kw= '='
            {
            kw=(Token)match(input,18,FOLLOW_18_in_ruleOpSingleAssign929); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:435:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:436:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:437:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign969);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign980); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:444:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:447:28: (kw= '+=' )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:449:2: kw= '+='
            {
            kw=(Token)match(input,19,FOLLOW_19_in_ruleOpMultiAssign1017); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:462:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:463:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:464:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1056);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1066); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:471:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:474:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:475:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:475:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:476:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1113);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:484:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    int LA5_2 = input.LA(2);

                    if ( (synpred2_InternalEmfComponentsDsl()) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:484:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:484:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:484:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:489:6: ( () ( ( ruleOpOr ) ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:489:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:489:7: ()
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:490:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:495:2: ( ( ruleOpOr ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:496:1: ( ruleOpOr )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:496:1: ( ruleOpOr )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:497:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1166);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:510:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:511:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:511:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:512:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1189);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:536:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:537:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:538:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1228);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1239); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:545:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:548:28: (kw= '||' )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:550:2: kw= '||'
            {
            kw=(Token)match(input,20,FOLLOW_20_in_ruleOpOr1276); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:563:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:564:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:565:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1315);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1325); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:572:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:575:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:576:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:576:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:577:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1372);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:585:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    int LA6_2 = input.LA(2);

                    if ( (synpred3_InternalEmfComponentsDsl()) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:585:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:585:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:585:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:590:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:590:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:590:7: ()
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:591:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:596:2: ( ( ruleOpAnd ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:597:1: ( ruleOpAnd )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:597:1: ( ruleOpAnd )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:598:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1425);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:611:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:612:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:612:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:613:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1448);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:637:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:638:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:639:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1487);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1498); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:646:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:649:28: (kw= '&&' )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:651:2: kw= '&&'
            {
            kw=(Token)match(input,21,FOLLOW_21_in_ruleOpAnd1535); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:664:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:665:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:666:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1574);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression1584); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:673:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:676:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:677:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:677:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:678:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1631);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:686:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    int LA7_2 = input.LA(2);

                    if ( (synpred4_InternalEmfComponentsDsl()) ) {
                        alt7=1;
                    }


                }
                else if ( (LA7_0==23) ) {
                    int LA7_3 = input.LA(2);

                    if ( (synpred4_InternalEmfComponentsDsl()) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:686:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:686:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:686:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:691:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:691:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:691:7: ()
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:692:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:697:2: ( ( ruleOpEquality ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:698:1: ( ruleOpEquality )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:698:1: ( ruleOpEquality )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:699:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1684);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:712:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:713:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:713:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:714:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1707);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:738:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:739:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:740:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality1746);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality1757); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:747:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:750:28: ( (kw= '==' | kw= '!=' ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:751:1: (kw= '==' | kw= '!=' )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:751:1: (kw= '==' | kw= '!=' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:752:2: kw= '=='
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleOpEquality1795); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:759:2: kw= '!='
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpEquality1814); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:772:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:773:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:774:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1854);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression1864); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:781:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:784:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:785:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:785:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:786:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1911);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:794:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop9:
            do {
                int alt9=3;
                switch ( input.LA(1) ) {
                case 27:
                    {
                    int LA9_2 = input.LA(2);

                    if ( (synpred6_InternalEmfComponentsDsl()) ) {
                        alt9=2;
                    }


                    }
                    break;
                case 28:
                    {
                    int LA9_3 = input.LA(2);

                    if ( (synpred6_InternalEmfComponentsDsl()) ) {
                        alt9=2;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA9_4 = input.LA(2);

                    if ( (synpred5_InternalEmfComponentsDsl()) ) {
                        alt9=1;
                    }


                    }
                    break;
                case 25:
                    {
                    int LA9_5 = input.LA(2);

                    if ( (synpred6_InternalEmfComponentsDsl()) ) {
                        alt9=2;
                    }


                    }
                    break;
                case 26:
                    {
                    int LA9_6 = input.LA(2);

                    if ( (synpred6_InternalEmfComponentsDsl()) ) {
                        alt9=2;
                    }


                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:794:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:794:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:794:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:794:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:794:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:796:5: ( () otherlv_2= 'instanceof' )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:796:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:796:6: ()
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:797:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleXRelationalExpression1947); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:806:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:807:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:807:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:808:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression1970);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:825:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:825:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:825:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:825:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:825:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:830:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:830:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:830:7: ()
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:831:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:836:2: ( ( ruleOpCompare ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:837:1: ( ruleOpCompare )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:837:1: ( ruleOpCompare )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:838:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2031);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:851:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:852:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:852:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:853:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2054);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_6_0, 
            	              		"XOtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:877:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:878:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:879:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2094);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2105); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:886:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:889:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:890:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:890:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt10=1;
                }
                break;
            case 26:
                {
                alt10=2;
                }
                break;
            case 27:
                {
                alt10=3;
                }
                break;
            case 28:
                {
                alt10=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:891:2: kw= '>='
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpCompare2143); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:898:2: kw= '<='
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpCompare2162); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:905:2: kw= '>'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpCompare2181); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:912:2: kw= '<'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpCompare2200); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:925:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:926:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:927:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2240);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2250); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:934:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:937:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:938:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:938:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:939:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2297);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:947:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:947:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:947:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:947:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:952:6: ( () ( ( ruleOpOther ) ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:952:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:952:7: ()
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:953:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:958:2: ( ( ruleOpOther ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:959:1: ( ruleOpOther )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:959:1: ( ruleOpOther )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:960:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2350);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:973:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:974:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:974:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:975:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2373);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:999:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1000:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1001:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2412);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2423); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1008:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1011:28: ( (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1012:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1012:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            int alt14=8;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt14=1;
                }
                break;
            case 30:
                {
                alt14=2;
                }
                break;
            case 31:
                {
                alt14=3;
                }
                break;
            case 27:
                {
                alt14=4;
                }
                break;
            case 28:
                {
                alt14=5;
                }
                break;
            case 32:
                {
                alt14=6;
                }
                break;
            case 33:
                {
                alt14=7;
                }
                break;
            case 34:
                {
                alt14=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1013:2: kw= '->'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOther2461); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1020:2: kw= '..'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpOther2480); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1027:2: kw= '=>'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther2499); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1033:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1033:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1034:2: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2519); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_0()); 
                          
                    }
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1039:1: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==27) ) {
                        int LA12_1 = input.LA(2);

                        if ( (LA12_1==EOF||(LA12_1>=RULE_STRING && LA12_1<=RULE_ID)||LA12_1==16||LA12_1==28||(LA12_1>=35 && LA12_1<=36)||LA12_1==41||LA12_1==47||LA12_1==49||LA12_1==53||LA12_1==55||(LA12_1>=59 && LA12_1<=61)||LA12_1==64||(LA12_1>=66 && LA12_1<=73)) ) {
                            alt12=2;
                        }
                        else if ( (LA12_1==27) && (synpred8_InternalEmfComponentsDsl())) {
                            alt12=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1039:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1039:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1039:3: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1043:5: (kw= '>' kw= '>' )
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1044:2: kw= '>' kw= '>'
                            {
                            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2550); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2563); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1057:2: kw= '>'
                            {
                            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2584); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1063:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1063:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1064:2: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2606); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_0()); 
                          
                    }
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1069:1: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==28) ) {
                        int LA13_1 = input.LA(2);

                        if ( (synpred9_InternalEmfComponentsDsl()) ) {
                            alt13=1;
                        }
                        else if ( (true) ) {
                            alt13=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1069:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1069:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1069:3: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1073:5: (kw= '<' kw= '<' )
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1074:2: kw= '<' kw= '<'
                            {
                            kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2637); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2650); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1087:2: kw= '<'
                            {
                            kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2671); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1094:2: kw= '<>'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther2692); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1101:2: kw= '?:'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpOther2711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1108:2: kw= '<=>'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpOther2730); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_7()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1121:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1122:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1123:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2770);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2780); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1130:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1133:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1134:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1134:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1135:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2827);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1143:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==35) ) {
                    int LA15_2 = input.LA(2);

                    if ( (synpred10_InternalEmfComponentsDsl()) ) {
                        alt15=1;
                    }


                }
                else if ( (LA15_0==36) ) {
                    int LA15_3 = input.LA(2);

                    if ( (synpred10_InternalEmfComponentsDsl()) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1143:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1143:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1143:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1148:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1148:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1148:7: ()
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1149:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1154:2: ( ( ruleOpAdd ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1155:1: ( ruleOpAdd )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1155:1: ( ruleOpAdd )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1156:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2880);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1169:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1170:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1170:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1171:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2903);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1195:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1196:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1197:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd2942);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd2953); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1204:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1207:28: ( (kw= '+' | kw= '-' ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1208:1: (kw= '+' | kw= '-' )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1208:1: (kw= '+' | kw= '-' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            else if ( (LA16_0==36) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1209:2: kw= '+'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpAdd2991); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1216:2: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpAdd3010); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1229:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1230:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1231:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3050);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3060); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1238:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1241:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1242:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1242:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1243:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3107);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1251:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop17:
            do {
                int alt17=2;
                switch ( input.LA(1) ) {
                case 37:
                    {
                    int LA17_2 = input.LA(2);

                    if ( (synpred11_InternalEmfComponentsDsl()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA17_3 = input.LA(2);

                    if ( (synpred11_InternalEmfComponentsDsl()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA17_4 = input.LA(2);

                    if ( (synpred11_InternalEmfComponentsDsl()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA17_5 = input.LA(2);

                    if ( (synpred11_InternalEmfComponentsDsl()) ) {
                        alt17=1;
                    }


                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1251:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1251:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1251:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1256:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1256:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1256:7: ()
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1257:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1262:2: ( ( ruleOpMulti ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1263:1: ( ruleOpMulti )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1263:1: ( ruleOpMulti )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1264:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3160);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1277:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1278:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1278:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1279:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3183);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1303:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1304:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1305:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3222);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3233); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1312:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1315:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1316:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1316:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt18=1;
                }
                break;
            case 38:
                {
                alt18=2;
                }
                break;
            case 39:
                {
                alt18=3;
                }
                break;
            case 40:
                {
                alt18=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1317:2: kw= '*'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpMulti3271); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1324:2: kw= '**'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpMulti3290); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1331:2: kw= '/'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpMulti3309); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1338:2: kw= '%'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpMulti3328); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1351:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1352:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1353:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3368);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3378); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1360:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1363:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1364:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1364:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=35 && LA19_0<=36)||LA19_0==41) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)||LA19_0==16||LA19_0==28||LA19_0==47||LA19_0==49||LA19_0==53||LA19_0==55||(LA19_0>=59 && LA19_0<=61)||LA19_0==64||(LA19_0>=66 && LA19_0<=73)) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1364:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1364:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1364:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1364:3: ()
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1365:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1370:2: ( ( ruleOpUnary ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1371:1: ( ruleOpUnary )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1371:1: ( ruleOpUnary )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1372:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3436);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1385:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1386:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1386:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1387:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3457);
                    lv_operand_2_0=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"XCastedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1405:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3486);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCastedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1421:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1422:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1423:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3522);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3533); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1430:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1433:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1434:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1434:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt20=1;
                }
                break;
            case 36:
                {
                alt20=2;
                }
                break;
            case 35:
                {
                alt20=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1435:2: kw= '!'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpUnary3571); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1442:2: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpUnary3590); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1449:2: kw= '+'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpUnary3609); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1462:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1463:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1464:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3649);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3659); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1471:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1474:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1475:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1475:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1476:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3706);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1484:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==42) ) {
                    int LA21_2 = input.LA(2);

                    if ( (synpred12_InternalEmfComponentsDsl()) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1484:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1484:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1484:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1486:5: ( () otherlv_2= 'as' )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1486:6: () otherlv_2= 'as'
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1486:6: ()
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1487:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXCastedExpression3741); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1496:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1497:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1497:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1498:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3764);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1522:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1523:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1524:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3802);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall3812); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1531:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_explicitOperationCall_16_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_typeArguments_11_0 = null;

        EObject lv_typeArguments_13_0 = null;

        EObject lv_memberCallArguments_17_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_20_0 = null;

        EObject lv_memberCallArguments_22_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1534:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1535:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1535:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1536:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3859);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1544:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop29:
            do {
                int alt29=3;
                switch ( input.LA(1) ) {
                case 43:
                    {
                    int LA29_2 = input.LA(2);

                    if ( (synpred13_InternalEmfComponentsDsl()) ) {
                        alt29=1;
                    }
                    else if ( (synpred14_InternalEmfComponentsDsl()) ) {
                        alt29=2;
                    }


                    }
                    break;
                case 44:
                    {
                    int LA29_3 = input.LA(2);

                    if ( (synpred14_InternalEmfComponentsDsl()) ) {
                        alt29=2;
                    }


                    }
                    break;
                case 45:
                    {
                    int LA29_4 = input.LA(2);

                    if ( (synpred14_InternalEmfComponentsDsl()) ) {
                        alt29=2;
                    }


                    }
                    break;

                }

                switch (alt29) {
            	case 1 :
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1544:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1544:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1544:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1544:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1544:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1550:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1550:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1550:26: ()
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1551:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall3908); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1560:1: ( ( ruleValidID ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1561:1: ( ruleValidID )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1561:1: ( ruleValidID )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1562:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3931);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3947);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1583:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1584:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1584:1: (lv_value_5_0= ruleXAssignment )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1585:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3969);
            	    lv_value_5_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_5_0, 
            	              		"XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1602:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1602:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1602:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1602:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1602:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1618:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1618:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1618:8: ()
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1619:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1624:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt22=3;
            	    switch ( input.LA(1) ) {
            	    case 43:
            	        {
            	        alt22=1;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt22=2;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt22=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt22) {
            	        case 1 :
            	            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1624:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall4055); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1629:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1629:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1630:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1630:1: (lv_nullSafe_8_0= '?.' )
            	            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1631:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,44,FOLLOW_44_in_ruleXMemberFeatureCall4079); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_8_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "nullSafe", true, "?.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1645:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1645:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1646:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1646:1: (lv_spreading_9_0= '*.' )
            	            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1647:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall4116); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_spreading_9_0, grammarAccess.getXMemberFeatureCallAccess().getSpreadingAsteriskFullStopKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "spreading", true, "*.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1660:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==28) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1660:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,28,FOLLOW_28_in_ruleXMemberFeatureCall4145); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1664:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1665:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1665:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1666:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4166);
            	            lv_typeArguments_11_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_11_0, 
            	                      		"JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1682:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop23:
            	            do {
            	                int alt23=2;
            	                int LA23_0 = input.LA(1);

            	                if ( (LA23_0==46) ) {
            	                    alt23=1;
            	                }


            	                switch (alt23) {
            	            	case 1 :
            	            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1682:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,46,FOLLOW_46_in_ruleXMemberFeatureCall4179); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1686:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1687:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1687:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1688:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4200);
            	            	    lv_typeArguments_13_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_13_0, 
            	            	              		"JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop23;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,27,FOLLOW_27_in_ruleXMemberFeatureCall4214); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1708:3: ( ( ruleValidID ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1709:1: ( ruleValidID )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1709:1: ( ruleValidID )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1710:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4239);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1723:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt27=2;
            	    alt27 = dfa27.predict(input);
            	    switch (alt27) {
            	        case 1 :
            	            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1723:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1723:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1723:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1730:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1731:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,47,FOLLOW_47_in_ruleXMemberFeatureCall4273); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_16_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1744:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt26=3;
            	            alt26 = dfa26.predict(input);
            	            switch (alt26) {
            	                case 1 :
            	                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1744:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1744:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1744:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1761:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1762:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4358);
            	                    lv_memberCallArguments_17_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_17_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1779:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1779:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1779:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1779:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1780:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1780:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1781:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4386);
            	                    lv_memberCallArguments_18_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_18_0, 
            	                              		"XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1797:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop25:
            	                    do {
            	                        int alt25=2;
            	                        int LA25_0 = input.LA(1);

            	                        if ( (LA25_0==46) ) {
            	                            alt25=1;
            	                        }


            	                        switch (alt25) {
            	                    	case 1 :
            	                    	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1797:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,46,FOLLOW_46_in_ruleXMemberFeatureCall4399); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1801:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1802:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1802:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1803:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4420);
            	                    	    lv_memberCallArguments_20_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_20_0, 
            	                    	              		"XExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop25;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,48,FOLLOW_48_in_ruleXMemberFeatureCall4437); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1823:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt28=2;
            	    alt28 = dfa28.predict(input);
            	    switch (alt28) {
            	        case 1 :
            	            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1823:4: ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1826:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1827:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4472);
            	            lv_memberCallArguments_22_0=ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"memberCallArguments",
            	                      		lv_memberCallArguments_22_0, 
            	                      		"XClosure");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1851:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1852:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1853:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4512);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4522); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1860:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XFeatureCall_3 = null;

        EObject this_XLiteral_4 = null;

        EObject this_XIfExpression_5 = null;

        EObject this_XForLoopExpression_6 = null;

        EObject this_XWhileExpression_7 = null;

        EObject this_XDoWhileExpression_8 = null;

        EObject this_XThrowExpression_9 = null;

        EObject this_XReturnExpression_10 = null;

        EObject this_XTryCatchFinallyExpression_11 = null;

        EObject this_XParenthesizedExpression_12 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1863:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1864:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1864:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt30=13;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1865:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4569);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XConstructorCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1875:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4596);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBlockExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1885:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4623);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSwitchExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1895:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4650);
                    this_XFeatureCall_3=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFeatureCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1905:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4677);
                    this_XLiteral_4=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1915:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4704);
                    this_XIfExpression_5=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1925:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4731);
                    this_XForLoopExpression_6=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XForLoopExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1935:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4758);
                    this_XWhileExpression_7=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1945:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4785);
                    this_XDoWhileExpression_8=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XDoWhileExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1955:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4812);
                    this_XThrowExpression_9=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XThrowExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1965:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4839);
                    this_XReturnExpression_10=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XReturnExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1975:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4866);
                    this_XTryCatchFinallyExpression_11=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTryCatchFinallyExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1985:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4893);
                    this_XParenthesizedExpression_12=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXLiteral"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2001:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2002:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2003:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral4928);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral4938); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2010:1: ruleXLiteral returns [EObject current=null] : ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XNumberLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2013:28: ( ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2014:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2014:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt31=6;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==49) && (synpred18_InternalEmfComponentsDsl())) {
                alt31=1;
            }
            else if ( ((LA31_0>=67 && LA31_0<=68)) ) {
                alt31=2;
            }
            else if ( ((LA31_0>=RULE_HEX && LA31_0<=RULE_DECIMAL)) ) {
                alt31=3;
            }
            else if ( (LA31_0==69) ) {
                alt31=4;
            }
            else if ( (LA31_0==RULE_STRING) ) {
                alt31=5;
            }
            else if ( (LA31_0==70) ) {
                alt31=6;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2014:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2014:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2014:3: ( ( () '[' ) )=>this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral4998);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2027:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5026);
                    this_XBooleanLiteral_1=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2037:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5053);
                    this_XNumberLiteral_2=ruleXNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNumberLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2047:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5080);
                    this_XNullLiteral_3=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2057:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5107);
                    this_XStringLiteral_4=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2067:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5134);
                    this_XTypeLiteral_5=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXClosure"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2083:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2084:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2085:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5169);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5179); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2092:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_explicitSyntax_5_0=null;
        Token otherlv_7=null;
        EObject lv_declaredFormalParameters_2_0 = null;

        EObject lv_declaredFormalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2095:28: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2096:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2096:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2096:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2096:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2096:3: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2098:5: ( () otherlv_1= '[' )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2098:6: () otherlv_1= '['
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2098:6: ()
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2099:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleXClosure5239); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
                  
            }

            }


            }

            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2108:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2108:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2123:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2123:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2123:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_ID||LA33_0==31||LA33_0==47) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2123:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2123:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2124:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2124:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2125:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5312);
                            lv_declaredFormalParameters_2_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"declaredFormalParameters",
                                      		lv_declaredFormalParameters_2_0, 
                                      		"JvmFormalParameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2141:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop32:
                            do {
                                int alt32=2;
                                int LA32_0 = input.LA(1);

                                if ( (LA32_0==46) ) {
                                    alt32=1;
                                }


                                switch (alt32) {
                            	case 1 :
                            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2141:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleXClosure5325); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	          
                            	    }
                            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2145:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2146:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2146:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2147:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5346);
                            	    lv_declaredFormalParameters_4_0=ruleJvmFormalParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"declaredFormalParameters",
                            	              		lv_declaredFormalParameters_4_0, 
                            	              		"JvmFormalParameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop32;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2163:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2164:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2164:1: (lv_explicitSyntax_5_0= '|' )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2165:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,50,FOLLOW_50_in_ruleXClosure5368); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_1_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXClosureRule());
                      	        }
                             		setWithLastConsumed(current, "explicitSyntax", true, "|");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2178:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2179:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2179:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2180:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5405);
            lv_expression_6_0=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"XExpressionInClosure");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,51,FOLLOW_51_in_ruleXClosure5417); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXExpressionInClosure"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2208:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2209:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2210:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5453);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5463); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInClosure"


    // $ANTLR start "ruleXExpressionInClosure"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2217:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2220:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2221:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2221:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2221:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2221:2: ()
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2222:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2227:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=RULE_STRING && LA36_0<=RULE_ID)||LA36_0==16||LA36_0==28||(LA36_0>=35 && LA36_0<=36)||LA36_0==41||LA36_0==47||LA36_0==49||LA36_0==53||LA36_0==55||(LA36_0>=59 && LA36_0<=64)||(LA36_0>=66 && LA36_0<=73)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2227:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2227:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2228:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2228:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2229:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5519);
            	    lv_expressions_1_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpressionInClosureRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2245:2: (otherlv_2= ';' )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==52) ) {
            	        alt35=1;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2245:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleXExpressionInClosure5532); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2257:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2258:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2259:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5572);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5582); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2266:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2269:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2270:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2270:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2270:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2270:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2270:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2286:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2286:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2286:7: ()
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2287:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2292:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID||LA38_0==31||LA38_0==47) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2292:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2292:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2293:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2293:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2294:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5690);
                    lv_declaredFormalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"declaredFormalParameters",
                              		lv_declaredFormalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2310:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==46) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2310:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXShortClosure5703); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2314:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2315:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2315:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2316:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5724);
                    	    lv_declaredFormalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declaredFormalParameters",
                    	              		lv_declaredFormalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2332:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2333:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2333:1: (lv_explicitSyntax_4_0= '|' )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2334:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,50,FOLLOW_50_in_ruleXShortClosure5746); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_explicitSyntax_4_0, grammarAccess.getXShortClosureAccess().getExplicitSyntaxVerticalLineKeyword_0_0_2_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXShortClosureRule());
              	        }
                     		setWithLastConsumed(current, "explicitSyntax", true, "|");
              	    
            }

            }


            }


            }


            }

            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2347:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2348:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2348:1: (lv_expression_5_0= ruleXExpression )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2349:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5782);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2373:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2374:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2375:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5818);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5828); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2382:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2385:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2386:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2386:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2386:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleXParenthesizedExpression5865); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5887);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleXParenthesizedExpression5898); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2411:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2412:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2413:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5934);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5944); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2420:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2423:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2424:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2424:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2424:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2424:2: ()
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2425:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXIfExpression5990); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleXIfExpression6002); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2438:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2439:1: (lv_if_3_0= ruleXExpression )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2439:1: (lv_if_3_0= ruleXExpression )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2440:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6023);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleXIfExpression6035); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2460:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2461:1: (lv_then_5_0= ruleXExpression )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2461:1: (lv_then_5_0= ruleXExpression )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2462:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6056);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2478:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==54) ) {
                int LA39_1 = input.LA(2);

                if ( (synpred22_InternalEmfComponentsDsl()) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2478:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2478:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2478:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,54,FOLLOW_54_in_ruleXIfExpression6077); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2483:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2484:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2484:1: (lv_else_7_0= ruleXExpression )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2485:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6099);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2509:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2510:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2511:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6137);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6147); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2518:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        AntlrDatatypeRuleToken lv_localVarName_6_0 = null;

        EObject lv_switch_8_0 = null;

        EObject lv_cases_11_0 = null;

        EObject lv_default_14_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2521:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2522:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2522:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2522:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2522:2: ()
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2523:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression6193); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2532:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_STRING && LA41_0<=RULE_ID)||LA41_0==16||LA41_0==28||(LA41_0>=35 && LA41_0<=36)||LA41_0==41||LA41_0==49||LA41_0==53||LA41_0==55||(LA41_0>=59 && LA41_0<=61)||LA41_0==64||(LA41_0>=66 && LA41_0<=73)) ) {
                alt41=1;
            }
            else if ( (LA41_0==47) ) {
                int LA41_2 = input.LA(2);

                if ( (LA41_2==RULE_ID) ) {
                    int LA41_3 = input.LA(3);

                    if ( ((LA41_3>=18 && LA41_3<=40)||(LA41_3>=42 && LA41_3<=45)||(LA41_3>=47 && LA41_3<=49)||LA41_3==65) ) {
                        alt41=1;
                    }
                    else if ( (LA41_3==56) && (synpred24_InternalEmfComponentsDsl())) {
                        alt41=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA41_2>=RULE_STRING && LA41_2<=RULE_DECIMAL)||LA41_2==16||LA41_2==28||(LA41_2>=35 && LA41_2<=36)||LA41_2==41||LA41_2==47||LA41_2==49||LA41_2==53||LA41_2==55||(LA41_2>=59 && LA41_2<=61)||LA41_2==64||(LA41_2>=66 && LA41_2<=73)) ) {
                    alt41=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2532:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2532:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2532:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2532:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_ID) ) {
                        int LA40_1 = input.LA(2);

                        if ( (LA40_1==56) && (synpred23_InternalEmfComponentsDsl())) {
                            alt40=1;
                        }
                    }
                    switch (alt40) {
                        case 1 :
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2532:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2537:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2537:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2537:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2538:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2538:1: (lv_localVarName_2_0= ruleValidID )
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2539:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6236);
                            lv_localVarName_2_0=ruleValidID();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"localVarName",
                                      		lv_localVarName_2_0, 
                                      		"ValidID");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleXSwitchExpression6248); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2559:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2560:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2560:1: (lv_switch_4_0= ruleXExpression )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2561:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6272);
                    lv_switch_4_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_4_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2578:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2578:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2578:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2578:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2578:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2584:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2584:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,47,FOLLOW_47_in_ruleXSwitchExpression6316); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2588:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2589:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2589:1: (lv_localVarName_6_0= ruleValidID )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2590:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6337);
                    lv_localVarName_6_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_6_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,56,FOLLOW_56_in_ruleXSwitchExpression6349); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2610:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2611:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2611:1: (lv_switch_8_0= ruleXExpression )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2612:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6372);
                    lv_switch_8_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_8_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,48,FOLLOW_48_in_ruleXSwitchExpression6384); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleXSwitchExpression6398); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2636:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID||LA42_0==31||LA42_0==47||LA42_0==56||LA42_0==58) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2637:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2637:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2638:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6419);
            	    lv_cases_11_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_11_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);

            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2654:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==57) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2654:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,57,FOLLOW_57_in_ruleXSwitchExpression6433); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,56,FOLLOW_56_in_ruleXSwitchExpression6445); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2662:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2663:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2663:1: (lv_default_14_0= ruleXExpression )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2664:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6466);
                    lv_default_14_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_14_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,17,FOLLOW_17_in_ruleXSwitchExpression6480); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2692:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2693:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2694:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6516);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6526); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2701:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2704:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2705:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2705:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2705:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2705:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID||LA44_0==31||LA44_0==47) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2706:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2706:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2707:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6572);
                    lv_typeGuard_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeGuard",
                              		lv_typeGuard_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2723:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==58) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2723:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXCasePart6586); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2727:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2728:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2728:1: (lv_case_2_0= ruleXExpression )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2729:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6607);
                    lv_case_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"case",
                              		lv_case_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleXCasePart6621); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2749:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2750:1: (lv_then_4_0= ruleXExpression )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2750:1: (lv_then_4_0= ruleXExpression )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2751:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6642);
            lv_then_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2775:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2776:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2777:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6678);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6688); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2784:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2787:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2788:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2788:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2788:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2788:2: ()
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2789:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXForLoopExpression6734); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleXForLoopExpression6746); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2802:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2803:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2803:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2804:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6767);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_3_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,56,FOLLOW_56_in_ruleXForLoopExpression6779); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2824:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2825:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2825:1: (lv_forExpression_5_0= ruleXExpression )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2826:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6800);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,48,FOLLOW_48_in_ruleXForLoopExpression6812); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2846:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2847:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2847:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2848:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6833);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_7_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2872:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2873:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2874:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6869);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6879); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2881:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2884:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2885:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2885:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2885:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2885:2: ()
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2886:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXWhileExpression6925); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleXWhileExpression6937); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2899:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2900:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2900:1: (lv_predicate_3_0= ruleXExpression )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2901:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6958);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleXWhileExpression6970); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2921:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2922:1: (lv_body_5_0= ruleXExpression )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2922:1: (lv_body_5_0= ruleXExpression )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2923:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6991);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2947:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2948:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2949:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7027);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7037); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2956:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2959:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2960:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2960:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2960:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2960:2: ()
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2961:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXDoWhileExpression7083); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2970:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2971:1: (lv_body_2_0= ruleXExpression )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2971:1: (lv_body_2_0= ruleXExpression )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2972:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7104);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,60,FOLLOW_60_in_ruleXDoWhileExpression7116); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleXDoWhileExpression7128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2996:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2997:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2997:1: (lv_predicate_5_0= ruleXExpression )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2998:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7149);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,48,FOLLOW_48_in_ruleXDoWhileExpression7161); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3026:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3027:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3028:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7197);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7207); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3035:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3038:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3039:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3039:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3039:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3039:2: ()
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3040:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleXBlockExpression7253); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3049:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=RULE_STRING && LA47_0<=RULE_ID)||LA47_0==16||LA47_0==28||(LA47_0>=35 && LA47_0<=36)||LA47_0==41||LA47_0==47||LA47_0==49||LA47_0==53||LA47_0==55||(LA47_0>=59 && LA47_0<=64)||(LA47_0>=66 && LA47_0<=73)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3049:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3049:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3050:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3050:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3051:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7275);
            	    lv_expressions_2_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3067:2: (otherlv_3= ';' )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==52) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3067:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleXBlockExpression7288); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleXBlockExpression7304); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionInsideBlock"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3083:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3084:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3085:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7340);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7350); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInsideBlock"


    // $ANTLR start "ruleXExpressionInsideBlock"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3092:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3095:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3096:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3096:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=62 && LA48_0<=63)) ) {
                alt48=1;
            }
            else if ( ((LA48_0>=RULE_STRING && LA48_0<=RULE_ID)||LA48_0==16||LA48_0==28||(LA48_0>=35 && LA48_0<=36)||LA48_0==41||LA48_0==47||LA48_0==49||LA48_0==53||LA48_0==55||(LA48_0>=59 && LA48_0<=61)||LA48_0==64||(LA48_0>=66 && LA48_0<=73)) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3097:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7397);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3107:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7424);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInsideBlock"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3123:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3124:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3125:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7459);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7469); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3132:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3135:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3136:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3136:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3136:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3136:2: ()
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3137:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3142:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==62) ) {
                alt49=1;
            }
            else if ( (LA49_0==63) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3142:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3142:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3143:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3143:1: (lv_writeable_1_0= 'var' )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3144:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,62,FOLLOW_62_in_ruleXVariableDeclaration7522); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "var");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3158:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,63,FOLLOW_63_in_ruleXVariableDeclaration7553); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3162:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                int LA50_1 = input.LA(2);

                if ( (synpred25_InternalEmfComponentsDsl()) ) {
                    alt50=1;
                }
                else if ( (true) ) {
                    alt50=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA50_0==47) && (synpred25_InternalEmfComponentsDsl())) {
                alt50=1;
            }
            else if ( (LA50_0==31) && (synpred25_InternalEmfComponentsDsl())) {
                alt50=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3162:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3162:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3162:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3170:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3170:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3170:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3171:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3171:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3172:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7601);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3188:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3189:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3189:1: (lv_name_4_0= ruleValidID )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3190:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7622);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3207:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3207:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3208:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3208:1: (lv_name_5_0= ruleValidID )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3209:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7651);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3225:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==18) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3225:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleXVariableDeclaration7665); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3229:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3230:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3230:1: (lv_right_7_0= ruleXExpression )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3231:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7686);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3255:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3256:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3257:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7724);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7734); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3264:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3267:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3268:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3268:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3268:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3268:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==RULE_ID||LA52_1==28||LA52_1==43||LA52_1==49) ) {
                    alt52=1;
                }
            }
            else if ( (LA52_0==31||LA52_0==47) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3269:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3269:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3270:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7780);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterType",
                              		lv_parameterType_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3286:3: ( (lv_name_1_0= ruleValidID ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3287:1: (lv_name_1_0= ruleValidID )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3287:1: (lv_name_1_0= ruleValidID )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3288:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7802);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleFullJvmFormalParameter"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3312:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3313:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3314:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7838);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7848); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFullJvmFormalParameter"


    // $ANTLR start "ruleFullJvmFormalParameter"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3321:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3324:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3325:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3325:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3325:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3325:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3326:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3326:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3327:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7894);
            lv_parameterType_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"parameterType",
                      		lv_parameterType_0_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3343:2: ( (lv_name_1_0= ruleValidID ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3344:1: (lv_name_1_0= ruleValidID )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3344:1: (lv_name_1_0= ruleValidID )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3345:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7915);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFullJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3369:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3370:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3371:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7951);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7961); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3378:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_12_0 = null;

        EObject lv_featureCallArguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3381:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3382:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3382:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3382:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3382:2: ()
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3383:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3388:2: ( ( ruleStaticQualifier ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==65) ) {
                    alt53=1;
                }
            }
            switch (alt53) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3389:1: ( ruleStaticQualifier )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3389:1: ( ruleStaticQualifier )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3390:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8018);
                    ruleStaticQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3403:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==28) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3403:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleXFeatureCall8032); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3407:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3408:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3408:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3409:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8053);
                    lv_typeArguments_3_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_3_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3425:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==46) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3425:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleXFeatureCall8066); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3429:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3430:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3430:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3431:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8087);
                    	    lv_typeArguments_5_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_5_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleXFeatureCall8101); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3451:3: ( ( ruleIdOrSuper ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3452:1: ( ruleIdOrSuper )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3452:1: ( ruleIdOrSuper )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3453:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8126);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3466:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt58=2;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3466:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3466:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3466:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3473:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3474:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,47,FOLLOW_47_in_ruleXFeatureCall8160); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_8_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3487:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt57=3;
                    alt57 = dfa57.predict(input);
                    switch (alt57) {
                        case 1 :
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3487:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3487:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3487:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3504:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3505:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8245);
                            lv_featureCallArguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3522:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3522:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3522:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3522:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3523:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3523:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3524:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8273);
                            lv_featureCallArguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3540:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop56:
                            do {
                                int alt56=2;
                                int LA56_0 = input.LA(1);

                                if ( (LA56_0==46) ) {
                                    alt56=1;
                                }


                                switch (alt56) {
                            	case 1 :
                            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3540:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,46,FOLLOW_46_in_ruleXFeatureCall8286); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3544:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3545:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3545:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3546:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8307);
                            	    lv_featureCallArguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop56;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,48,FOLLOW_48_in_ruleXFeatureCall8324); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3566:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt59=2;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3566:4: ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3569:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3570:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8359);
                    lv_featureCallArguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"featureCallArguments",
                              		lv_featureCallArguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3594:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3595:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3596:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8397);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8408); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3603:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3606:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3607:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3607:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                alt60=1;
            }
            else if ( (LA60_0==64) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3608:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8455);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ValidID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3620:2: kw= 'super'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleIdOrSuper8479); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleStaticQualifier"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3633:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3634:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3635:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8520);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8531); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticQualifier"


    // $ANTLR start "ruleStaticQualifier"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3642:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3645:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3646:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3646:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt61=0;
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==RULE_ID) ) {
                    int LA61_2 = input.LA(2);

                    if ( (LA61_2==65) ) {
                        alt61=1;
                    }


                }


                switch (alt61) {
            	case 1 :
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3647:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8578);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,65,FOLLOW_65_in_ruleStaticQualifier8596); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt61 >= 1 ) break loop61;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaticQualifier"


    // $ANTLR start "entryRuleXConstructorCall"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3671:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3672:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3673:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8637);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8647); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3680:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;

        EObject lv_arguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3683:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3684:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3684:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3684:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3684:2: ()
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3685:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXConstructorCall8693); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3694:1: ( ( ruleQualifiedName ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3695:1: ( ruleQualifiedName )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3695:1: ( ruleQualifiedName )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3696:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8716);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3709:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt63=2;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3709:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3709:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3709:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleXConstructorCall8737); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3714:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3715:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3715:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3716:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8759);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_4_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3732:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==46) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3732:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleXConstructorCall8772); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3736:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3737:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3737:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3738:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8793);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_6_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleXConstructorCall8807); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3758:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3758:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3758:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3758:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,47,FOLLOW_47_in_ruleXConstructorCall8830); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3763:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt65=3;
                    alt65 = dfa65.predict(input);
                    switch (alt65) {
                        case 1 :
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3763:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3763:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3763:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3780:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3781:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8903);
                            lv_arguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3798:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3798:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3798:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3798:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3799:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3799:1: (lv_arguments_10_0= ruleXExpression )
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3800:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8931);
                            lv_arguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3816:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop64:
                            do {
                                int alt64=2;
                                int LA64_0 = input.LA(1);

                                if ( (LA64_0==46) ) {
                                    alt64=1;
                                }


                                switch (alt64) {
                            	case 1 :
                            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3816:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,46,FOLLOW_46_in_ruleXConstructorCall8944); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3820:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3821:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3821:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3822:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8965);
                            	    lv_arguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"arguments",
                            	              		lv_arguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop64;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,48,FOLLOW_48_in_ruleXConstructorCall8982); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3842:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3842:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3845:1: (lv_arguments_14_0= ruleXClosure )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3846:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall9017);
                    lv_arguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3870:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3871:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3872:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9054);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9064); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3879:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3882:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3883:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3883:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3883:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3883:2: ()
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3884:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3889:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==67) ) {
                alt68=1;
            }
            else if ( (LA68_0==68) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3889:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXBooleanLiteral9111); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3894:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3894:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3895:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3895:1: (lv_isTrue_2_0= 'true' )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3896:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,68,FOLLOW_68_in_ruleXBooleanLiteral9135); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3917:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3918:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3919:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9185);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9195); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3926:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3929:28: ( ( () otherlv_1= 'null' ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3930:1: ( () otherlv_1= 'null' )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3930:1: ( () otherlv_1= 'null' )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3930:2: () otherlv_1= 'null'
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3930:2: ()
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3931:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXNullLiteral9241); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXNumberLiteral"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3948:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3949:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3950:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9277);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9287); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNumberLiteral"


    // $ANTLR start "ruleXNumberLiteral"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3957:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3960:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3961:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3961:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3961:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3961:2: ()
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3962:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3967:2: ( (lv_value_1_0= ruleNumber ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3968:1: (lv_value_1_0= ruleNumber )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3968:1: (lv_value_1_0= ruleNumber )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3969:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral9342);
            lv_value_1_0=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXNumberLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Number");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNumberLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3993:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3994:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3995:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9378);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9388); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4002:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4005:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4006:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4006:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4006:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4006:2: ()
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4007:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4012:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4013:1: (lv_value_1_0= RULE_STRING )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4013:1: (lv_value_1_0= RULE_STRING )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4014:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9439); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4038:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4039:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4040:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9480);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9490); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4047:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4050:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4051:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4051:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4051:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4051:2: ()
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4052:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXTypeLiteral9536); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleXTypeLiteral9548); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4065:1: ( ( ruleQualifiedName ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4066:1: ( ruleQualifiedName )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4066:1: ( ruleQualifiedName )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4067:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9571);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleXTypeLiteral9583); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4092:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4093:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4094:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9619);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9629); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4101:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4104:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4105:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4105:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4105:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4105:2: ()
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4106:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXThrowExpression9675); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4115:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4116:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4116:1: (lv_expression_2_0= ruleXExpression )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4117:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9696);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4141:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4142:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4143:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9732);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9742); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4150:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4153:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4154:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4154:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4154:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4154:2: ()
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4155:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXReturnExpression9788); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4164:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt69=2;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4164:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4169:1: (lv_expression_2_0= ruleXExpression )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4170:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9819);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4194:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4195:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4196:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9856);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9866); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4203:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4206:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4207:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4207:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4207:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4207:2: ()
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4208:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXTryCatchFinallyExpression9912); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4217:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4218:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4218:1: (lv_expression_2_0= ruleXExpression )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4219:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9933);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4235:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==75) ) {
                alt72=1;
            }
            else if ( (LA72_0==74) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4235:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4235:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4235:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4235:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt70=0;
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==75) ) {
                            int LA70_2 = input.LA(2);

                            if ( (synpred34_InternalEmfComponentsDsl()) ) {
                                alt70=1;
                            }


                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4235:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4237:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4238:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9963);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"catchClauses",
                    	              		lv_catchClauses_3_0, 
                    	              		"XCatchClause");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt70 >= 1 ) break loop70;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(70, input);
                                throw eee;
                        }
                        cnt70++;
                    } while (true);

                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4254:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==74) ) {
                        int LA71_1 = input.LA(2);

                        if ( (synpred35_InternalEmfComponentsDsl()) ) {
                            alt71=1;
                        }
                    }
                    switch (alt71) {
                        case 1 :
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4254:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4254:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4254:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,74,FOLLOW_74_in_ruleXTryCatchFinallyExpression9985); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4259:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4260:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4260:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4261:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10007);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finallyExpression",
                                      		lv_finallyExpression_5_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4278:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4278:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4278:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,74,FOLLOW_74_in_ruleXTryCatchFinallyExpression10029); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4282:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4283:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4283:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4284:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10050);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyExpression",
                              		lv_finallyExpression_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4308:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4309:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4310:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10088);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10098); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4317:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4320:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4321:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4321:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4321:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4321:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4321:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleXCatchClause10143); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleXCatchClause10156); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4330:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4331:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4331:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4332:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10177);
            lv_declaredParam_2_0=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"FullJvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleXCatchClause10189); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4352:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4353:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4353:1: (lv_expression_4_0= ruleXExpression )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4354:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10210);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4378:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4379:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4380:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10247);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10258); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4387:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4390:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4391:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4391:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4392:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10305);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4402:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==43) ) {
                    int LA73_2 = input.LA(2);

                    if ( (LA73_2==RULE_ID) ) {
                        int LA73_3 = input.LA(3);

                        if ( (synpred37_InternalEmfComponentsDsl()) ) {
                            alt73=1;
                        }


                    }


                }


                switch (alt73) {
            	case 1 :
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4402:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4402:2: ( ( '.' )=>kw= '.' )
            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4402:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,43,FOLLOW_43_in_ruleQualifiedName10333); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10356);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleNumber"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4429:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4433:2: (iv_ruleNumber= ruleNumber EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4434:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10410);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10421); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4444:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEX_0=null;
        Token this_INT_1=null;
        Token this_DECIMAL_2=null;
        Token kw=null;
        Token this_INT_4=null;
        Token this_DECIMAL_5=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4448:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4449:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4449:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_HEX) ) {
                alt77=1;
            }
            else if ( ((LA77_0>=RULE_INT && LA77_0<=RULE_DECIMAL)) ) {
                alt77=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4449:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber10465); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4457:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4457:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4457:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4457:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==RULE_INT) ) {
                        alt74=1;
                    }
                    else if ( (LA74_0==RULE_DECIMAL) ) {
                        alt74=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 74, 0, input);

                        throw nvae;
                    }
                    switch (alt74) {
                        case 1 :
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4457:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10493); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4465:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10519); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4472:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==43) ) {
                        int LA76_1 = input.LA(2);

                        if ( ((LA76_1>=RULE_INT && LA76_1<=RULE_DECIMAL)) ) {
                            alt76=1;
                        }
                    }
                    switch (alt76) {
                        case 1 :
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4473:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,43,FOLLOW_43_in_ruleNumber10539); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4478:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt75=2;
                            int LA75_0 = input.LA(1);

                            if ( (LA75_0==RULE_INT) ) {
                                alt75=1;
                            }
                            else if ( (LA75_0==RULE_DECIMAL) ) {
                                alt75=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 75, 0, input);

                                throw nvae;
                            }
                            switch (alt75) {
                                case 1 :
                                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4478:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10555); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4486:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10581); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_DECIMAL_5);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_DECIMAL_5, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4504:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4505:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4506:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10634);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10644); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4513:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4516:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4517:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4517:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_ID) ) {
                alt79=1;
            }
            else if ( (LA79_0==31||LA79_0==47) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4517:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4517:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4518:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10692);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4526:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==49) ) {
                            int LA78_2 = input.LA(2);

                            if ( (LA78_2==51) ) {
                                int LA78_3 = input.LA(3);

                                if ( (synpred38_InternalEmfComponentsDsl()) ) {
                                    alt78=1;
                                }


                            }


                        }


                        switch (alt78) {
                    	case 1 :
                    	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4526:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4529:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4529:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4529:6: ()
                    	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4530:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleJvmTypeReference10730); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleJvmTypeReference10742); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4545:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10774);
                    this_XFunctionTypeRef_4=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4561:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4562:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4563:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10809);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10819); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4570:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4573:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4574:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4574:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4574:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4574:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==47) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4574:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleXFunctionTypeRef10857); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4578:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==RULE_ID||LA81_0==31||LA81_0==47) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4578:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4578:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4579:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4579:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4580:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10879);
                            lv_paramTypes_1_0=ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"paramTypes",
                                      		lv_paramTypes_1_0, 
                                      		"JvmTypeReference");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4596:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop80:
                            do {
                                int alt80=2;
                                int LA80_0 = input.LA(1);

                                if ( (LA80_0==46) ) {
                                    alt80=1;
                                }


                                switch (alt80) {
                            	case 1 :
                            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4596:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXFunctionTypeRef10892); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4600:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4601:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4601:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4602:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10913);
                            	    lv_paramTypes_3_0=ruleJvmTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"paramTypes",
                            	              		lv_paramTypes_3_0, 
                            	              		"JvmTypeReference");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop80;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleXFunctionTypeRef10929); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleXFunctionTypeRef10943); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4626:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4627:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4627:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4628:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10964);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4652:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4653:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4654:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11000);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11010); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4661:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4664:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4665:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4665:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4665:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4665:2: ( ( ruleQualifiedName ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4666:1: ( ruleQualifiedName )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4666:1: ( ruleQualifiedName )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4667:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11058);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4680:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt84=2;
            alt84 = dfa84.predict(input);
            switch (alt84) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4680:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4680:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4680:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleJvmParameterizedTypeReference11079); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4685:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4686:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4686:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4687:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11101);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4703:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==46) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4703:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleJvmParameterizedTypeReference11114); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4707:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4708:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4708:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4709:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11135);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleJvmParameterizedTypeReference11149); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4737:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4738:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4739:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11187);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11197); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4746:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4749:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4750:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4750:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_ID||LA85_0==31||LA85_0==47) ) {
                alt85=1;
            }
            else if ( (LA85_0==76) ) {
                alt85=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4751:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11244);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4761:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11271);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4777:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4778:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4779:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11306);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11316); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4786:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4789:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4790:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4790:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4790:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4790:2: ()
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4791:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleJvmWildcardTypeReference11362); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4800:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt86=3;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==77) ) {
                alt86=1;
            }
            else if ( (LA86_0==64) ) {
                alt86=2;
            }
            switch (alt86) {
                case 1 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4800:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4800:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4801:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4801:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4802:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11384);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4819:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4819:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4820:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4820:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4821:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11411);
                    lv_constraints_3_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_3_0, 
                              		"JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4845:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4846:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4847:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11449);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11459); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4854:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4857:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4858:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4858:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4858:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleJvmUpperBound11496); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4862:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4863:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4863:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4864:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11517);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4888:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4889:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4890:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11553);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11563); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4897:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4900:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4901:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4901:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4901:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleJvmUpperBoundAnded11600); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4905:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4906:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4906:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4907:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11621);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4931:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4932:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4933:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11657);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11667); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4940:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4943:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4944:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4944:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4944:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleJvmLowerBound11704); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4948:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4949:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4949:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4950:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11725);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleValidID"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4976:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4977:2: (iv_ruleValidID= ruleValidID EOF )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4978:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11764);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11775); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4985:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4988:28: (this_ID_0= RULE_ID )
            // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4989:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11814); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"

    // $ANTLR start synpred1_InternalEmfComponentsDsl
    public final void synpred1_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:356:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:356:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:356:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:356:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:356:5: ()
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:357:1: 
        {
        }

        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:357:2: ( ( ruleOpMultiAssign ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:358:1: ( ruleOpMultiAssign )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:358:1: ( ruleOpMultiAssign )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:359:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalEmfComponentsDsl786);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalEmfComponentsDsl

    // $ANTLR start synpred2_InternalEmfComponentsDsl
    public final void synpred2_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:484:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:484:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:484:4: ( () ( ( ruleOpOr ) ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:484:5: () ( ( ruleOpOr ) )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:484:5: ()
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:485:1: 
        {
        }

        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:485:2: ( ( ruleOpOr ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:486:1: ( ruleOpOr )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:486:1: ( ruleOpOr )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:487:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalEmfComponentsDsl1134);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalEmfComponentsDsl

    // $ANTLR start synpred3_InternalEmfComponentsDsl
    public final void synpred3_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:585:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:585:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:585:4: ( () ( ( ruleOpAnd ) ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:585:5: () ( ( ruleOpAnd ) )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:585:5: ()
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:586:1: 
        {
        }

        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:586:2: ( ( ruleOpAnd ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:587:1: ( ruleOpAnd )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:587:1: ( ruleOpAnd )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:588:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalEmfComponentsDsl1393);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalEmfComponentsDsl

    // $ANTLR start synpred4_InternalEmfComponentsDsl
    public final void synpred4_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:686:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:686:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:686:4: ( () ( ( ruleOpEquality ) ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:686:5: () ( ( ruleOpEquality ) )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:686:5: ()
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:687:1: 
        {
        }

        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:687:2: ( ( ruleOpEquality ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:688:1: ( ruleOpEquality )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:688:1: ( ruleOpEquality )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:689:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalEmfComponentsDsl1652);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalEmfComponentsDsl

    // $ANTLR start synpred5_InternalEmfComponentsDsl
    public final void synpred5_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:794:4: ( ( () 'instanceof' ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:794:5: ( () 'instanceof' )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:794:5: ( () 'instanceof' )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:794:6: () 'instanceof'
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:794:6: ()
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:795:1: 
        {
        }

        match(input,24,FOLLOW_24_in_synpred5_InternalEmfComponentsDsl1928); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalEmfComponentsDsl

    // $ANTLR start synpred6_InternalEmfComponentsDsl
    public final void synpred6_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:825:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:825:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:825:9: ( () ( ( ruleOpCompare ) ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:825:10: () ( ( ruleOpCompare ) )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:825:10: ()
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:826:1: 
        {
        }

        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:826:2: ( ( ruleOpCompare ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:827:1: ( ruleOpCompare )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:827:1: ( ruleOpCompare )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:828:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalEmfComponentsDsl1999);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalEmfComponentsDsl

    // $ANTLR start synpred7_InternalEmfComponentsDsl
    public final void synpred7_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:947:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:947:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:947:4: ( () ( ( ruleOpOther ) ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:947:5: () ( ( ruleOpOther ) )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:947:5: ()
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:948:1: 
        {
        }

        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:948:2: ( ( ruleOpOther ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:949:1: ( ruleOpOther )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:949:1: ( ruleOpOther )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:950:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalEmfComponentsDsl2318);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalEmfComponentsDsl

    // $ANTLR start synpred8_InternalEmfComponentsDsl
    public final void synpred8_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1039:3: ( ( '>' '>' ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1039:4: ( '>' '>' )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1039:4: ( '>' '>' )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1040:2: '>' '>'
        {
        match(input,27,FOLLOW_27_in_synpred8_InternalEmfComponentsDsl2534); if (state.failed) return ;
        match(input,27,FOLLOW_27_in_synpred8_InternalEmfComponentsDsl2539); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalEmfComponentsDsl

    // $ANTLR start synpred9_InternalEmfComponentsDsl
    public final void synpred9_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1069:3: ( ( '<' '<' ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1069:4: ( '<' '<' )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1069:4: ( '<' '<' )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1070:2: '<' '<'
        {
        match(input,28,FOLLOW_28_in_synpred9_InternalEmfComponentsDsl2621); if (state.failed) return ;
        match(input,28,FOLLOW_28_in_synpred9_InternalEmfComponentsDsl2626); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalEmfComponentsDsl

    // $ANTLR start synpred10_InternalEmfComponentsDsl
    public final void synpred10_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1143:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1143:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1143:4: ( () ( ( ruleOpAdd ) ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1143:5: () ( ( ruleOpAdd ) )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1143:5: ()
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1144:1: 
        {
        }

        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1144:2: ( ( ruleOpAdd ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1145:1: ( ruleOpAdd )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1145:1: ( ruleOpAdd )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1146:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred10_InternalEmfComponentsDsl2848);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalEmfComponentsDsl

    // $ANTLR start synpred11_InternalEmfComponentsDsl
    public final void synpred11_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1251:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1251:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1251:4: ( () ( ( ruleOpMulti ) ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1251:5: () ( ( ruleOpMulti ) )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1251:5: ()
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1252:1: 
        {
        }

        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1252:2: ( ( ruleOpMulti ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1253:1: ( ruleOpMulti )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1253:1: ( ruleOpMulti )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1254:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred11_InternalEmfComponentsDsl3128);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalEmfComponentsDsl

    // $ANTLR start synpred12_InternalEmfComponentsDsl
    public final void synpred12_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1484:3: ( ( () 'as' ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1484:4: ( () 'as' )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1484:4: ( () 'as' )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1484:5: () 'as'
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1484:5: ()
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1485:1: 
        {
        }

        match(input,42,FOLLOW_42_in_synpred12_InternalEmfComponentsDsl3722); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalEmfComponentsDsl

    // $ANTLR start synpred13_InternalEmfComponentsDsl
    public final void synpred13_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1544:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1544:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1544:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1544:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1544:6: ()
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1545:1: 
        {
        }

        match(input,43,FOLLOW_43_in_synpred13_InternalEmfComponentsDsl3876); if (state.failed) return ;
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1546:1: ( ( ruleValidID ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1547:1: ( ruleValidID )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1547:1: ( ruleValidID )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1548:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred13_InternalEmfComponentsDsl3885);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred13_InternalEmfComponentsDsl3891);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalEmfComponentsDsl

    // $ANTLR start synpred14_InternalEmfComponentsDsl
    public final void synpred14_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1602:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1602:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1602:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1602:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1602:10: ()
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1603:1: 
        {
        }

        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1603:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt87=3;
        switch ( input.LA(1) ) {
        case 43:
            {
            alt87=1;
            }
            break;
        case 44:
            {
            alt87=2;
            }
            break;
        case 45:
            {
            alt87=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 87, 0, input);

            throw nvae;
        }

        switch (alt87) {
            case 1 :
                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1603:4: '.'
                {
                match(input,43,FOLLOW_43_in_synpred14_InternalEmfComponentsDsl3994); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1605:6: ( ( '?.' ) )
                {
                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1605:6: ( ( '?.' ) )
                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1606:1: ( '?.' )
                {
                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1606:1: ( '?.' )
                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1607:2: '?.'
                {
                match(input,44,FOLLOW_44_in_synpred14_InternalEmfComponentsDsl4008); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1612:6: ( ( '*.' ) )
                {
                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1612:6: ( ( '*.' ) )
                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1613:1: ( '*.' )
                {
                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1613:1: ( '*.' )
                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1614:2: '*.'
                {
                match(input,45,FOLLOW_45_in_synpred14_InternalEmfComponentsDsl4028); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalEmfComponentsDsl

    // $ANTLR start synpred15_InternalEmfComponentsDsl
    public final void synpred15_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1723:4: ( ( '(' ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1724:1: ( '(' )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1724:1: ( '(' )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1725:2: '('
        {
        match(input,47,FOLLOW_47_in_synpred15_InternalEmfComponentsDsl4255); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalEmfComponentsDsl

    // $ANTLR start synpred16_InternalEmfComponentsDsl
    public final void synpred16_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1744:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1744:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1744:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1744:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1744:6: ()
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1745:1: 
        {
        }

        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1745:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt89=2;
        int LA89_0 = input.LA(1);

        if ( (LA89_0==RULE_ID||LA89_0==31||LA89_0==47) ) {
            alt89=1;
        }
        switch (alt89) {
            case 1 :
                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1745:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1745:3: ( ( ruleJvmFormalParameter ) )
                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1746:1: ( ruleJvmFormalParameter )
                {
                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1746:1: ( ruleJvmFormalParameter )
                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1747:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalEmfComponentsDsl4307);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1749:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop88:
                do {
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==46) ) {
                        alt88=1;
                    }


                    switch (alt88) {
                	case 1 :
                	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1749:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,46,FOLLOW_46_in_synpred16_InternalEmfComponentsDsl4314); if (state.failed) return ;
                	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1750:1: ( ( ruleJvmFormalParameter ) )
                	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1751:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1751:1: ( ruleJvmFormalParameter )
                	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1752:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalEmfComponentsDsl4321);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop88;
                    }
                } while (true);


                }
                break;

        }

        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1754:6: ( ( '|' ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1755:1: ( '|' )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1755:1: ( '|' )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1756:2: '|'
        {
        match(input,50,FOLLOW_50_in_synpred16_InternalEmfComponentsDsl4335); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalEmfComponentsDsl

    // $ANTLR start synpred17_InternalEmfComponentsDsl
    public final void synpred17_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1823:4: ( ( () '[' ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1823:5: ( () '[' )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1823:5: ( () '[' )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1823:6: () '['
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1823:6: ()
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:1824:1: 
        {
        }

        match(input,49,FOLLOW_49_in_synpred17_InternalEmfComponentsDsl4455); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalEmfComponentsDsl

    // $ANTLR start synpred18_InternalEmfComponentsDsl
    public final void synpred18_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2014:3: ( ( () '[' ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2014:4: ( () '[' )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2014:4: ( () '[' )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2014:5: () '['
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2014:5: ()
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2015:1: 
        {
        }

        match(input,49,FOLLOW_49_in_synpred18_InternalEmfComponentsDsl4979); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalEmfComponentsDsl

    // $ANTLR start synpred20_InternalEmfComponentsDsl
    public final void synpred20_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2108:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2108:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2108:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2108:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2108:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt91=2;
        int LA91_0 = input.LA(1);

        if ( (LA91_0==RULE_ID||LA91_0==31||LA91_0==47) ) {
            alt91=1;
        }
        switch (alt91) {
            case 1 :
                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2108:7: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2108:7: ( ( ruleJvmFormalParameter ) )
                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2109:1: ( ruleJvmFormalParameter )
                {
                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2109:1: ( ruleJvmFormalParameter )
                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2110:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalEmfComponentsDsl5258);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2112:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop90:
                do {
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==46) ) {
                        alt90=1;
                    }


                    switch (alt90) {
                	case 1 :
                	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2112:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,46,FOLLOW_46_in_synpred20_InternalEmfComponentsDsl5265); if (state.failed) return ;
                	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2113:1: ( ( ruleJvmFormalParameter ) )
                	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2114:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2114:1: ( ruleJvmFormalParameter )
                	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2115:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalEmfComponentsDsl5272);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop90;
                    }
                } while (true);


                }
                break;

        }

        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2117:6: ( ( '|' ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2118:1: ( '|' )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2118:1: ( '|' )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2119:2: '|'
        {
        match(input,50,FOLLOW_50_in_synpred20_InternalEmfComponentsDsl5286); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalEmfComponentsDsl

    // $ANTLR start synpred22_InternalEmfComponentsDsl
    public final void synpred22_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2478:4: ( 'else' )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2478:6: 'else'
        {
        match(input,54,FOLLOW_54_in_synpred22_InternalEmfComponentsDsl6069); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalEmfComponentsDsl

    // $ANTLR start synpred23_InternalEmfComponentsDsl
    public final void synpred23_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2532:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2532:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2532:5: ( ( ( ruleValidID ) ) ':' )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2532:6: ( ( ruleValidID ) ) ':'
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2532:6: ( ( ruleValidID ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2533:1: ( ruleValidID )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2533:1: ( ruleValidID )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2534:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred23_InternalEmfComponentsDsl6211);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,56,FOLLOW_56_in_synpred23_InternalEmfComponentsDsl6217); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalEmfComponentsDsl

    // $ANTLR start synpred24_InternalEmfComponentsDsl
    public final void synpred24_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2578:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2578:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2578:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2578:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,47,FOLLOW_47_in_synpred24_InternalEmfComponentsDsl6293); if (state.failed) return ;
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2579:1: ( ( ruleValidID ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2580:1: ( ruleValidID )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2580:1: ( ruleValidID )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:2581:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred24_InternalEmfComponentsDsl6300);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,56,FOLLOW_56_in_synpred24_InternalEmfComponentsDsl6306); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalEmfComponentsDsl

    // $ANTLR start synpred25_InternalEmfComponentsDsl
    public final void synpred25_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3162:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3162:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3162:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3162:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3162:6: ( ( ruleJvmTypeReference ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3163:1: ( ruleJvmTypeReference )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3163:1: ( ruleJvmTypeReference )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3164:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred25_InternalEmfComponentsDsl7571);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3166:2: ( ( ruleValidID ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3167:1: ( ruleValidID )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3167:1: ( ruleValidID )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3168:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred25_InternalEmfComponentsDsl7580);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalEmfComponentsDsl

    // $ANTLR start synpred26_InternalEmfComponentsDsl
    public final void synpred26_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3466:4: ( ( '(' ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3467:1: ( '(' )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3467:1: ( '(' )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3468:2: '('
        {
        match(input,47,FOLLOW_47_in_synpred26_InternalEmfComponentsDsl8142); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalEmfComponentsDsl

    // $ANTLR start synpred27_InternalEmfComponentsDsl
    public final void synpred27_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3487:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3487:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3487:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3487:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3487:6: ()
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3488:1: 
        {
        }

        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3488:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt95=2;
        int LA95_0 = input.LA(1);

        if ( (LA95_0==RULE_ID||LA95_0==31||LA95_0==47) ) {
            alt95=1;
        }
        switch (alt95) {
            case 1 :
                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3488:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3488:3: ( ( ruleJvmFormalParameter ) )
                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3489:1: ( ruleJvmFormalParameter )
                {
                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3489:1: ( ruleJvmFormalParameter )
                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3490:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalEmfComponentsDsl8194);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3492:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop94:
                do {
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==46) ) {
                        alt94=1;
                    }


                    switch (alt94) {
                	case 1 :
                	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3492:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,46,FOLLOW_46_in_synpred27_InternalEmfComponentsDsl8201); if (state.failed) return ;
                	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3493:1: ( ( ruleJvmFormalParameter ) )
                	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3494:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3494:1: ( ruleJvmFormalParameter )
                	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3495:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalEmfComponentsDsl8208);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop94;
                    }
                } while (true);


                }
                break;

        }

        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3497:6: ( ( '|' ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3498:1: ( '|' )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3498:1: ( '|' )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3499:2: '|'
        {
        match(input,50,FOLLOW_50_in_synpred27_InternalEmfComponentsDsl8222); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalEmfComponentsDsl

    // $ANTLR start synpred28_InternalEmfComponentsDsl
    public final void synpred28_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3566:4: ( ( () '[' ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3566:5: ( () '[' )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3566:5: ( () '[' )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3566:6: () '['
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3566:6: ()
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3567:1: 
        {
        }

        match(input,49,FOLLOW_49_in_synpred28_InternalEmfComponentsDsl8342); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalEmfComponentsDsl

    // $ANTLR start synpred29_InternalEmfComponentsDsl
    public final void synpred29_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3709:4: ( '<' )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3709:6: '<'
        {
        match(input,28,FOLLOW_28_in_synpred29_InternalEmfComponentsDsl8729); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalEmfComponentsDsl

    // $ANTLR start synpred30_InternalEmfComponentsDsl
    public final void synpred30_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3758:5: ( '(' )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3758:7: '('
        {
        match(input,47,FOLLOW_47_in_synpred30_InternalEmfComponentsDsl8822); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalEmfComponentsDsl

    // $ANTLR start synpred31_InternalEmfComponentsDsl
    public final void synpred31_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3763:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3763:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3763:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3763:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3763:6: ()
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3764:1: 
        {
        }

        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3764:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt97=2;
        int LA97_0 = input.LA(1);

        if ( (LA97_0==RULE_ID||LA97_0==31||LA97_0==47) ) {
            alt97=1;
        }
        switch (alt97) {
            case 1 :
                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3764:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3764:3: ( ( ruleJvmFormalParameter ) )
                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3765:1: ( ruleJvmFormalParameter )
                {
                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3765:1: ( ruleJvmFormalParameter )
                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3766:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalEmfComponentsDsl8852);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3768:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop96:
                do {
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==46) ) {
                        alt96=1;
                    }


                    switch (alt96) {
                	case 1 :
                	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3768:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,46,FOLLOW_46_in_synpred31_InternalEmfComponentsDsl8859); if (state.failed) return ;
                	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3769:1: ( ( ruleJvmFormalParameter ) )
                	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3770:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3770:1: ( ruleJvmFormalParameter )
                	    // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3771:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalEmfComponentsDsl8866);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop96;
                    }
                } while (true);


                }
                break;

        }

        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3773:6: ( ( '|' ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3774:1: ( '|' )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3774:1: ( '|' )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3775:2: '|'
        {
        match(input,50,FOLLOW_50_in_synpred31_InternalEmfComponentsDsl8880); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred31_InternalEmfComponentsDsl

    // $ANTLR start synpred32_InternalEmfComponentsDsl
    public final void synpred32_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3842:4: ( ( () '[' ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3842:5: ( () '[' )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3842:5: ( () '[' )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3842:6: () '['
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3842:6: ()
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:3843:1: 
        {
        }

        match(input,49,FOLLOW_49_in_synpred32_InternalEmfComponentsDsl9000); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalEmfComponentsDsl

    // $ANTLR start synpred33_InternalEmfComponentsDsl
    public final void synpred33_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4164:2: ( ( ruleXExpression ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4165:1: ( ruleXExpression )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4165:1: ( ruleXExpression )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4166:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred33_InternalEmfComponentsDsl9802);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalEmfComponentsDsl

    // $ANTLR start synpred34_InternalEmfComponentsDsl
    public final void synpred34_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4235:5: ( 'catch' )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4235:7: 'catch'
        {
        match(input,75,FOLLOW_75_in_synpred34_InternalEmfComponentsDsl9947); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalEmfComponentsDsl

    // $ANTLR start synpred35_InternalEmfComponentsDsl
    public final void synpred35_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4254:5: ( 'finally' )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4254:7: 'finally'
        {
        match(input,74,FOLLOW_74_in_synpred35_InternalEmfComponentsDsl9977); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalEmfComponentsDsl

    // $ANTLR start synpred37_InternalEmfComponentsDsl
    public final void synpred37_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4402:3: ( '.' )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4403:2: '.'
        {
        match(input,43,FOLLOW_43_in_synpred37_InternalEmfComponentsDsl10324); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalEmfComponentsDsl

    // $ANTLR start synpred38_InternalEmfComponentsDsl
    public final void synpred38_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4526:2: ( ( () '[' ']' ) )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4526:3: ( () '[' ']' )
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4526:3: ( () '[' ']' )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4526:4: () '[' ']'
        {
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4526:4: ()
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4527:1: 
        {
        }

        match(input,49,FOLLOW_49_in_synpred38_InternalEmfComponentsDsl10707); if (state.failed) return ;
        match(input,51,FOLLOW_51_in_synpred38_InternalEmfComponentsDsl10711); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred38_InternalEmfComponentsDsl

    // $ANTLR start synpred39_InternalEmfComponentsDsl
    public final void synpred39_InternalEmfComponentsDsl_fragment() throws RecognitionException {   
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4680:4: ( '<' )
        // ../it.rcpvision.emf.components.dsl/src-gen/it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.g:4680:6: '<'
        {
        match(input,28,FOLLOW_28_in_synpred39_InternalEmfComponentsDsl11071); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalEmfComponentsDsl

    // Delegated rules

    public final boolean synpred7_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalEmfComponentsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalEmfComponentsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA84 dfa84 = new DFA84(this);
    static final String DFA11_eotS =
        "\13\uffff";
    static final String DFA11_eofS =
        "\1\1\12\uffff";
    static final String DFA11_minS =
        "\1\4\1\uffff\10\0\1\uffff";
    static final String DFA11_maxS =
        "\1\113\1\uffff\10\0\1\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA11_specialS =
        "\2\uffff\1\7\1\6\1\3\1\5\1\4\1\0\1\1\1\2\1\uffff}>";
    static final String[] DFA11_transitionS = {
            "\5\1\7\uffff\2\1\1\uffff\10\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1"+
            "\11\17\1\1\uffff\16\1\1\uffff\12\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "()* loopback of 947:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_7 = input.LA(1);

                         
                        int index11_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalEmfComponentsDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_8 = input.LA(1);

                         
                        int index11_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalEmfComponentsDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_9 = input.LA(1);

                         
                        int index11_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalEmfComponentsDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_4 = input.LA(1);

                         
                        int index11_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalEmfComponentsDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_6 = input.LA(1);

                         
                        int index11_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalEmfComponentsDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_5 = input.LA(1);

                         
                        int index11_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalEmfComponentsDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalEmfComponentsDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalEmfComponentsDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA27_eotS =
        "\101\uffff";
    static final String DFA27_eofS =
        "\1\2\100\uffff";
    static final String DFA27_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA27_maxS =
        "\1\113\1\0\77\uffff";
    static final String DFA27_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA27_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA27_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\34\2\1\1\2\2\1\uffff\16\2\1\uffff\12"+
            "\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1723:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_1 = input.LA(1);

                         
                        int index27_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index27_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA26_eotS =
        "\36\uffff";
    static final String DFA26_eofS =
        "\36\uffff";
    static final String DFA26_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA26_maxS =
        "\1\111\2\0\33\uffff";
    static final String DFA26_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA26_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA26_transitionS = {
            "\4\5\1\1\7\uffff\1\5\13\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4"+
            "\uffff\1\5\5\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1744:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_0 = input.LA(1);

                         
                        int index26_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_0==RULE_ID) ) {s = 1;}

                        else if ( (LA26_0==47) ) {s = 2;}

                        else if ( (LA26_0==31) && (synpred16_InternalEmfComponentsDsl())) {s = 3;}

                        else if ( (LA26_0==50) && (synpred16_InternalEmfComponentsDsl())) {s = 4;}

                        else if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_DECIMAL)||LA26_0==16||LA26_0==28||(LA26_0>=35 && LA26_0<=36)||LA26_0==41||LA26_0==49||LA26_0==53||LA26_0==55||(LA26_0>=59 && LA26_0<=61)||LA26_0==64||(LA26_0>=66 && LA26_0<=73)) ) {s = 5;}

                        else if ( (LA26_0==48) ) {s = 29;}

                         
                        input.seek(index26_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_1 = input.LA(1);

                         
                        int index26_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalEmfComponentsDsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index26_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_2 = input.LA(1);

                         
                        int index26_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalEmfComponentsDsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index26_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA28_eotS =
        "\101\uffff";
    static final String DFA28_eofS =
        "\1\2\100\uffff";
    static final String DFA28_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA28_maxS =
        "\1\113\1\0\77\uffff";
    static final String DFA28_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA28_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA28_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\36\2\1\1\1\uffff\16\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1823:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_1 = input.LA(1);

                         
                        int index28_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index28_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA30_eotS =
        "\16\uffff";
    static final String DFA30_eofS =
        "\16\uffff";
    static final String DFA30_minS =
        "\1\4\15\uffff";
    static final String DFA30_maxS =
        "\1\111\15\uffff";
    static final String DFA30_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA30_specialS =
        "\16\uffff}>";
    static final String[] DFA30_transitionS = {
            "\4\5\1\4\7\uffff\1\2\13\uffff\1\4\22\uffff\1\15\1\uffff\1\5"+
            "\3\uffff\1\6\1\uffff\1\3\3\uffff\1\7\1\10\1\11\2\uffff\1\4\1"+
            "\uffff\1\1\4\5\1\12\1\13\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "1864:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )";
        }
    }
    static final String DFA34_eotS =
        "\40\uffff";
    static final String DFA34_eofS =
        "\40\uffff";
    static final String DFA34_minS =
        "\1\4\2\0\35\uffff";
    static final String DFA34_maxS =
        "\1\111\2\0\35\uffff";
    static final String DFA34_acceptS =
        "\3\uffff\2\1\1\2\32\uffff";
    static final String DFA34_specialS =
        "\1\0\1\1\1\2\35\uffff}>";
    static final String[] DFA34_transitionS = {
            "\4\5\1\1\7\uffff\1\5\13\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4"+
            "\uffff\1\5\5\uffff\1\2\1\uffff\1\5\1\4\1\5\1\uffff\1\5\1\uffff"+
            "\1\5\3\uffff\6\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "2108:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_0 = input.LA(1);

                         
                        int index34_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA34_0==RULE_ID) ) {s = 1;}

                        else if ( (LA34_0==47) ) {s = 2;}

                        else if ( (LA34_0==31) && (synpred20_InternalEmfComponentsDsl())) {s = 3;}

                        else if ( (LA34_0==50) && (synpred20_InternalEmfComponentsDsl())) {s = 4;}

                        else if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_DECIMAL)||LA34_0==16||LA34_0==28||(LA34_0>=35 && LA34_0<=36)||LA34_0==41||LA34_0==49||LA34_0==51||LA34_0==53||LA34_0==55||(LA34_0>=59 && LA34_0<=64)||(LA34_0>=66 && LA34_0<=73)) ) {s = 5;}

                         
                        input.seek(index34_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalEmfComponentsDsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_2 = input.LA(1);

                         
                        int index34_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalEmfComponentsDsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index34_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA58_eotS =
        "\101\uffff";
    static final String DFA58_eofS =
        "\1\2\100\uffff";
    static final String DFA58_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA58_maxS =
        "\1\113\1\0\77\uffff";
    static final String DFA58_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA58_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA58_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\34\2\1\1\2\2\1\uffff\16\2\1\uffff\12"+
            "\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "3466:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_1 = input.LA(1);

                         
                        int index58_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index58_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 58, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA57_eotS =
        "\36\uffff";
    static final String DFA57_eofS =
        "\36\uffff";
    static final String DFA57_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA57_maxS =
        "\1\111\2\0\33\uffff";
    static final String DFA57_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA57_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA57_transitionS = {
            "\4\5\1\1\7\uffff\1\5\13\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4"+
            "\uffff\1\5\5\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "3487:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA57_0 = input.LA(1);

                         
                        int index57_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA57_0==RULE_ID) ) {s = 1;}

                        else if ( (LA57_0==47) ) {s = 2;}

                        else if ( (LA57_0==31) && (synpred27_InternalEmfComponentsDsl())) {s = 3;}

                        else if ( (LA57_0==50) && (synpred27_InternalEmfComponentsDsl())) {s = 4;}

                        else if ( ((LA57_0>=RULE_STRING && LA57_0<=RULE_DECIMAL)||LA57_0==16||LA57_0==28||(LA57_0>=35 && LA57_0<=36)||LA57_0==41||LA57_0==49||LA57_0==53||LA57_0==55||(LA57_0>=59 && LA57_0<=61)||LA57_0==64||(LA57_0>=66 && LA57_0<=73)) ) {s = 5;}

                        else if ( (LA57_0==48) ) {s = 29;}

                         
                        input.seek(index57_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA57_1 = input.LA(1);

                         
                        int index57_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalEmfComponentsDsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index57_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA57_2 = input.LA(1);

                         
                        int index57_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalEmfComponentsDsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index57_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 57, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA59_eotS =
        "\101\uffff";
    static final String DFA59_eofS =
        "\1\2\100\uffff";
    static final String DFA59_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA59_maxS =
        "\1\113\1\0\77\uffff";
    static final String DFA59_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA59_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA59_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\36\2\1\1\1\uffff\16\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA59_eot = DFA.unpackEncodedString(DFA59_eotS);
    static final short[] DFA59_eof = DFA.unpackEncodedString(DFA59_eofS);
    static final char[] DFA59_min = DFA.unpackEncodedStringToUnsignedChars(DFA59_minS);
    static final char[] DFA59_max = DFA.unpackEncodedStringToUnsignedChars(DFA59_maxS);
    static final short[] DFA59_accept = DFA.unpackEncodedString(DFA59_acceptS);
    static final short[] DFA59_special = DFA.unpackEncodedString(DFA59_specialS);
    static final short[][] DFA59_transition;

    static {
        int numStates = DFA59_transitionS.length;
        DFA59_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA59_transition[i] = DFA.unpackEncodedString(DFA59_transitionS[i]);
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = DFA59_eot;
            this.eof = DFA59_eof;
            this.min = DFA59_min;
            this.max = DFA59_max;
            this.accept = DFA59_accept;
            this.special = DFA59_special;
            this.transition = DFA59_transition;
        }
        public String getDescription() {
            return "3566:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_1 = input.LA(1);

                         
                        int index59_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index59_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 59, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA63_eotS =
        "\101\uffff";
    static final String DFA63_eofS =
        "\1\2\100\uffff";
    static final String DFA63_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA63_maxS =
        "\1\113\1\0\77\uffff";
    static final String DFA63_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA63_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA63_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\11\2\1\1\25\2\1\uffff\16\2\1\uffff"+
            "\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "3709:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA63_1 = input.LA(1);

                         
                        int index63_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index63_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 63, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA66_eotS =
        "\101\uffff";
    static final String DFA66_eofS =
        "\1\2\100\uffff";
    static final String DFA66_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA66_maxS =
        "\1\113\1\0\77\uffff";
    static final String DFA66_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA66_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA66_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\34\2\1\1\2\2\1\uffff\16\2\1\uffff\12"+
            "\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "3758:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_1 = input.LA(1);

                         
                        int index66_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index66_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 66, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA65_eotS =
        "\36\uffff";
    static final String DFA65_eofS =
        "\36\uffff";
    static final String DFA65_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA65_maxS =
        "\1\111\2\0\33\uffff";
    static final String DFA65_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA65_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA65_transitionS = {
            "\4\5\1\1\7\uffff\1\5\13\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4"+
            "\uffff\1\5\5\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "3763:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_0 = input.LA(1);

                         
                        int index65_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA65_0==RULE_ID) ) {s = 1;}

                        else if ( (LA65_0==47) ) {s = 2;}

                        else if ( (LA65_0==31) && (synpred31_InternalEmfComponentsDsl())) {s = 3;}

                        else if ( (LA65_0==50) && (synpred31_InternalEmfComponentsDsl())) {s = 4;}

                        else if ( ((LA65_0>=RULE_STRING && LA65_0<=RULE_DECIMAL)||LA65_0==16||LA65_0==28||(LA65_0>=35 && LA65_0<=36)||LA65_0==41||LA65_0==49||LA65_0==53||LA65_0==55||(LA65_0>=59 && LA65_0<=61)||LA65_0==64||(LA65_0>=66 && LA65_0<=73)) ) {s = 5;}

                        else if ( (LA65_0==48) ) {s = 29;}

                         
                        input.seek(index65_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA65_1 = input.LA(1);

                         
                        int index65_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalEmfComponentsDsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index65_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA65_2 = input.LA(1);

                         
                        int index65_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalEmfComponentsDsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index65_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 65, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA67_eotS =
        "\101\uffff";
    static final String DFA67_eofS =
        "\1\2\100\uffff";
    static final String DFA67_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA67_maxS =
        "\1\113\1\0\77\uffff";
    static final String DFA67_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA67_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA67_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\36\2\1\1\1\uffff\16\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "3842:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_1 = input.LA(1);

                         
                        int index67_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index67_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 67, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA69_eotS =
        "\101\uffff";
    static final String DFA69_eofS =
        "\1\33\100\uffff";
    static final String DFA69_minS =
        "\1\4\32\0\46\uffff";
    static final String DFA69_maxS =
        "\1\113\32\0\46\uffff";
    static final String DFA69_acceptS =
        "\33\uffff\1\2\44\uffff\1\1";
    static final String DFA69_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\46\uffff}>";
    static final String[] DFA69_transitionS = {
            "\1\21\1\15\1\16\1\17\1\1\7\uffff\1\6\1\33\1\uffff\11\33\1\10"+
            "\6\33\1\4\1\3\4\33\1\2\5\33\1\32\1\33\1\12\1\uffff\2\33\1\23"+
            "\1\33\1\7\3\33\1\24\1\25\1\26\2\33\1\11\1\uffff\1\5\1\13\1\14"+
            "\1\20\1\22\1\27\1\30\1\31\2\33",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
    static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
    static final char[] DFA69_min = DFA.unpackEncodedStringToUnsignedChars(DFA69_minS);
    static final char[] DFA69_max = DFA.unpackEncodedStringToUnsignedChars(DFA69_maxS);
    static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
    static final short[] DFA69_special = DFA.unpackEncodedString(DFA69_specialS);
    static final short[][] DFA69_transition;

    static {
        int numStates = DFA69_transitionS.length;
        DFA69_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
        }
    }

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = DFA69_eot;
            this.eof = DFA69_eof;
            this.min = DFA69_min;
            this.max = DFA69_max;
            this.accept = DFA69_accept;
            this.special = DFA69_special;
            this.transition = DFA69_transition;
        }
        public String getDescription() {
            return "4164:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA69_1 = input.LA(1);

                         
                        int index69_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA69_2 = input.LA(1);

                         
                        int index69_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA69_3 = input.LA(1);

                         
                        int index69_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA69_4 = input.LA(1);

                         
                        int index69_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA69_5 = input.LA(1);

                         
                        int index69_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA69_6 = input.LA(1);

                         
                        int index69_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA69_7 = input.LA(1);

                         
                        int index69_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA69_8 = input.LA(1);

                         
                        int index69_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA69_9 = input.LA(1);

                         
                        int index69_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA69_10 = input.LA(1);

                         
                        int index69_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA69_11 = input.LA(1);

                         
                        int index69_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA69_12 = input.LA(1);

                         
                        int index69_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA69_13 = input.LA(1);

                         
                        int index69_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA69_14 = input.LA(1);

                         
                        int index69_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA69_15 = input.LA(1);

                         
                        int index69_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA69_16 = input.LA(1);

                         
                        int index69_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA69_17 = input.LA(1);

                         
                        int index69_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA69_18 = input.LA(1);

                         
                        int index69_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA69_19 = input.LA(1);

                         
                        int index69_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA69_20 = input.LA(1);

                         
                        int index69_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA69_21 = input.LA(1);

                         
                        int index69_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA69_22 = input.LA(1);

                         
                        int index69_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA69_23 = input.LA(1);

                         
                        int index69_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA69_24 = input.LA(1);

                         
                        int index69_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA69_25 = input.LA(1);

                         
                        int index69_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA69_26 = input.LA(1);

                         
                        int index69_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_26);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 69, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA84_eotS =
        "\101\uffff";
    static final String DFA84_eofS =
        "\1\2\100\uffff";
    static final String DFA84_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA84_maxS =
        "\1\113\1\0\77\uffff";
    static final String DFA84_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA84_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA84_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\11\2\1\1\25\2\1\uffff\16\2\1\uffff"+
            "\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA84_eot = DFA.unpackEncodedString(DFA84_eotS);
    static final short[] DFA84_eof = DFA.unpackEncodedString(DFA84_eofS);
    static final char[] DFA84_min = DFA.unpackEncodedStringToUnsignedChars(DFA84_minS);
    static final char[] DFA84_max = DFA.unpackEncodedStringToUnsignedChars(DFA84_maxS);
    static final short[] DFA84_accept = DFA.unpackEncodedString(DFA84_acceptS);
    static final short[] DFA84_special = DFA.unpackEncodedString(DFA84_specialS);
    static final short[][] DFA84_transition;

    static {
        int numStates = DFA84_transitionS.length;
        DFA84_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA84_transition[i] = DFA.unpackEncodedString(DFA84_transitionS[i]);
        }
    }

    class DFA84 extends DFA {

        public DFA84(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 84;
            this.eot = DFA84_eot;
            this.eof = DFA84_eof;
            this.min = DFA84_min;
            this.max = DFA84_max;
            this.accept = DFA84_accept;
            this.special = DFA84_special;
            this.transition = DFA84_transition;
        }
        public String getDescription() {
            return "4680:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA84_1 = input.LA(1);

                         
                        int index84_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalEmfComponentsDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index84_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 84, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel131 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_ruleModule_in_ruleModel153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImport236 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard352 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedNameWithWildcard371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule413 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleModule460 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModule481 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleModule493 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleModule505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment699 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment715 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment765 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment818 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpSingleAssign929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpMultiAssign1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1113 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1166 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1189 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpOr1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1372 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1425 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1448 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpAnd1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1631 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1684 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1707 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality1746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpEquality1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpEquality1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1911 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_24_in_ruleXRelationalExpression1947 = new BitSet(new long[]{0x0000800080000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression1970 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2031 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2054 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpCompare2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpCompare2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpCompare2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpCompare2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2297 = new BitSet(new long[]{0x00000007F8000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2350 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2373 = new BitSet(new long[]{0x00000007F8000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpOther2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOther2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2519 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2550 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2606 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2637 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOther2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpOther2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpOther2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2827 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2880 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2903 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd2942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpAdd2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpAdd3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3107 = new BitSet(new long[]{0x000001E000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3160 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3183 = new BitSet(new long[]{0x000001E000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpMulti3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpMulti3290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpMulti3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpMulti3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3436 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpUnary3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpUnary3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpUnary3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3706 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleXCastedExpression3741 = new BitSet(new long[]{0x0000800080000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3764 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall3812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3859 = new BitSet(new long[]{0x0000380000000002L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall3908 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3931 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3947 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3969 = new BitSet(new long[]{0x0000380000000002L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall4055 = new BitSet(new long[]{0x0000000010000100L});
    public static final BitSet FOLLOW_44_in_ruleXMemberFeatureCall4079 = new BitSet(new long[]{0x0000000010000100L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall4116 = new BitSet(new long[]{0x0000000010000100L});
    public static final BitSet FOLLOW_28_in_ruleXMemberFeatureCall4145 = new BitSet(new long[]{0x0000800080000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4166 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_46_in_ruleXMemberFeatureCall4179 = new BitSet(new long[]{0x0000800080000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4200 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_27_in_ruleXMemberFeatureCall4214 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4239 = new BitSet(new long[]{0x0002B80000000002L});
    public static final BitSet FOLLOW_47_in_ruleXMemberFeatureCall4273 = new BitSet(new long[]{0x38A78218900101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4358 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4386 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXMemberFeatureCall4399 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4420 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_48_in_ruleXMemberFeatureCall4437 = new BitSet(new long[]{0x0002380000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4472 = new BitSet(new long[]{0x0000380000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral4928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral4938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral4998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXClosure5239 = new BitSet(new long[]{0xF8AE8218900101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5312 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXClosure5325 = new BitSet(new long[]{0x0000800080000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5346 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_50_in_ruleXClosure5368 = new BitSet(new long[]{0xF8AA8218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5405 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXClosure5417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5519 = new BitSet(new long[]{0xF8B28218100101F2L,0x00000000000003FDL});
    public static final BitSet FOLLOW_52_in_ruleXExpressionInClosure5532 = new BitSet(new long[]{0xF8A28218100101F2L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5690 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXShortClosure5703 = new BitSet(new long[]{0x0000800080000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5724 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_50_in_ruleXShortClosure5746 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleXParenthesizedExpression5865 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5887 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXParenthesizedExpression5898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXIfExpression5990 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXIfExpression6002 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6023 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXIfExpression6035 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6056 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXIfExpression6077 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression6193 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6236 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXSwitchExpression6248 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6272 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_47_in_ruleXSwitchExpression6316 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6337 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXSwitchExpression6349 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6372 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXSwitchExpression6384 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXSwitchExpression6398 = new BitSet(new long[]{0x0500800080000100L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6419 = new BitSet(new long[]{0x0700800080020100L});
    public static final BitSet FOLLOW_57_in_ruleXSwitchExpression6433 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXSwitchExpression6445 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6466 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXSwitchExpression6480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6572 = new BitSet(new long[]{0x0500000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXCasePart6586 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6607 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXCasePart6621 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXForLoopExpression6734 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXForLoopExpression6746 = new BitSet(new long[]{0x0000800080000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6767 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXForLoopExpression6779 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6800 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXForLoopExpression6812 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXWhileExpression6925 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXWhileExpression6937 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6958 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXWhileExpression6970 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXDoWhileExpression7083 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7104 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleXDoWhileExpression7116 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXDoWhileExpression7128 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7149 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXDoWhileExpression7161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleXBlockExpression7253 = new BitSet(new long[]{0xF8A28218100301F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7275 = new BitSet(new long[]{0xF8B28218100301F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_52_in_ruleXBlockExpression7288 = new BitSet(new long[]{0xF8A28218100301F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_17_in_ruleXBlockExpression7304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXVariableDeclaration7522 = new BitSet(new long[]{0x0000800080000100L});
    public static final BitSet FOLLOW_63_in_ruleXVariableDeclaration7553 = new BitSet(new long[]{0x0000800080000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7601 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7622 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7651 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleXVariableDeclaration7665 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7780 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7894 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8018 = new BitSet(new long[]{0x0000000010000100L,0x0000000000000001L});
    public static final BitSet FOLLOW_28_in_ruleXFeatureCall8032 = new BitSet(new long[]{0x0000800080000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8053 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_46_in_ruleXFeatureCall8066 = new BitSet(new long[]{0x0000800080000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8087 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_27_in_ruleXFeatureCall8101 = new BitSet(new long[]{0x0000000010000100L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8126 = new BitSet(new long[]{0x0002800000000002L});
    public static final BitSet FOLLOW_47_in_ruleXFeatureCall8160 = new BitSet(new long[]{0x38A78218900101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8245 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8273 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXFeatureCall8286 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8307 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_48_in_ruleXFeatureCall8324 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleIdOrSuper8479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleStaticQualifier8596 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXConstructorCall8693 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8716 = new BitSet(new long[]{0x0002800010000002L});
    public static final BitSet FOLLOW_28_in_ruleXConstructorCall8737 = new BitSet(new long[]{0x0000800080000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8759 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_46_in_ruleXConstructorCall8772 = new BitSet(new long[]{0x0000800080000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8793 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_27_in_ruleXConstructorCall8807 = new BitSet(new long[]{0x0002800000000002L});
    public static final BitSet FOLLOW_47_in_ruleXConstructorCall8830 = new BitSet(new long[]{0x38A78218900101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8903 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8931 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXConstructorCall8944 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8965 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_48_in_ruleXConstructorCall8982 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall9017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXBooleanLiteral9111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXBooleanLiteral9135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9185 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXNullLiteral9241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral9342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXTypeLiteral9536 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXTypeLiteral9548 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9571 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXTypeLiteral9583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXThrowExpression9675 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXReturnExpression9788 = new BitSet(new long[]{0x38A28218100101F2L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXTryCatchFinallyExpression9912 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9963 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_74_in_ruleXTryCatchFinallyExpression9985 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXTryCatchFinallyExpression10029 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXCatchClause10143 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXCatchClause10156 = new BitSet(new long[]{0x0000800080000100L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10177 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXCatchClause10189 = new BitSet(new long[]{0x38A28218100101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10305 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleQualifiedName10333 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10356 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber10465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10493 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10519 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleNumber10539 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10692 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleJvmTypeReference10730 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleJvmTypeReference10742 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleXFunctionTypeRef10857 = new BitSet(new long[]{0x0001800080000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10879 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXFunctionTypeRef10892 = new BitSet(new long[]{0x0000800080000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10913 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_48_in_ruleXFunctionTypeRef10929 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleXFunctionTypeRef10943 = new BitSet(new long[]{0x0000800080000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11058 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleJvmParameterizedTypeReference11079 = new BitSet(new long[]{0x0000800080000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11101 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_46_in_ruleJvmParameterizedTypeReference11114 = new BitSet(new long[]{0x0000800080000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11135 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_27_in_ruleJvmParameterizedTypeReference11149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleJvmWildcardTypeReference11362 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002001L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleJvmUpperBound11496 = new BitSet(new long[]{0x0000800080000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleJvmUpperBoundAnded11600 = new BitSet(new long[]{0x0000800080000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleJvmLowerBound11704 = new BitSet(new long[]{0x0000800080000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalEmfComponentsDsl786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalEmfComponentsDsl1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalEmfComponentsDsl1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalEmfComponentsDsl1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred5_InternalEmfComponentsDsl1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalEmfComponentsDsl1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalEmfComponentsDsl2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred8_InternalEmfComponentsDsl2534 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_synpred8_InternalEmfComponentsDsl2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred9_InternalEmfComponentsDsl2621 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_synpred9_InternalEmfComponentsDsl2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred10_InternalEmfComponentsDsl2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred11_InternalEmfComponentsDsl3128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred12_InternalEmfComponentsDsl3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred13_InternalEmfComponentsDsl3876 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred13_InternalEmfComponentsDsl3885 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred13_InternalEmfComponentsDsl3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred14_InternalEmfComponentsDsl3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred14_InternalEmfComponentsDsl4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred14_InternalEmfComponentsDsl4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred15_InternalEmfComponentsDsl4255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalEmfComponentsDsl4307 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_46_in_synpred16_InternalEmfComponentsDsl4314 = new BitSet(new long[]{0x0000800080000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalEmfComponentsDsl4321 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_50_in_synpred16_InternalEmfComponentsDsl4335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred17_InternalEmfComponentsDsl4455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred18_InternalEmfComponentsDsl4979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalEmfComponentsDsl5258 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_46_in_synpred20_InternalEmfComponentsDsl5265 = new BitSet(new long[]{0x0000800080000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalEmfComponentsDsl5272 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_50_in_synpred20_InternalEmfComponentsDsl5286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_synpred22_InternalEmfComponentsDsl6069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred23_InternalEmfComponentsDsl6211 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_synpred23_InternalEmfComponentsDsl6217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred24_InternalEmfComponentsDsl6293 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred24_InternalEmfComponentsDsl6300 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_synpred24_InternalEmfComponentsDsl6306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred25_InternalEmfComponentsDsl7571 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred25_InternalEmfComponentsDsl7580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred26_InternalEmfComponentsDsl8142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalEmfComponentsDsl8194 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_46_in_synpred27_InternalEmfComponentsDsl8201 = new BitSet(new long[]{0x0000800080000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalEmfComponentsDsl8208 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_50_in_synpred27_InternalEmfComponentsDsl8222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred28_InternalEmfComponentsDsl8342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred29_InternalEmfComponentsDsl8729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred30_InternalEmfComponentsDsl8822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalEmfComponentsDsl8852 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_46_in_synpred31_InternalEmfComponentsDsl8859 = new BitSet(new long[]{0x0000800080000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalEmfComponentsDsl8866 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_50_in_synpred31_InternalEmfComponentsDsl8880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred32_InternalEmfComponentsDsl9000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred33_InternalEmfComponentsDsl9802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_synpred34_InternalEmfComponentsDsl9947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_synpred35_InternalEmfComponentsDsl9977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred37_InternalEmfComponentsDsl10324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred38_InternalEmfComponentsDsl10707 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_synpred38_InternalEmfComponentsDsl10711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred39_InternalEmfComponentsDsl11071 = new BitSet(new long[]{0x0000000000000002L});

}
﻿#pragma checksum "..\..\..\gui\VentanaDialogo.xaml" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "59D3DC7BEDE017D7C5D13F663EA274CC494CB03E"
//------------------------------------------------------------------------------
// <auto-generated>
//     Este código fue generado por una herramienta.
//     Versión de runtime:4.0.30319.42000
//
//     Los cambios en este archivo podrían causar un comportamiento incorrecto y se perderán si
//     se vuelve a generar el código.
// </auto-generated>
//------------------------------------------------------------------------------

using System;
using System.Diagnostics;
using System.Windows;
using System.Windows.Automation;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Ink;
using System.Windows.Input;
using System.Windows.Markup;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Media.Effects;
using System.Windows.Media.Imaging;
using System.Windows.Media.Media3D;
using System.Windows.Media.TextFormatting;
using System.Windows.Navigation;
using System.Windows.Shapes;
using System.Windows.Shell;


namespace IngresosGastos.gui {
    
    
    /// <summary>
    /// VentanaDialogo
    /// </summary>
    public partial class VentanaDialogo : System.Windows.Window, System.Windows.Markup.IComponentConnector {
        
        
        #line 8 "..\..\..\gui\VentanaDialogo.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.DatePicker DPFecha;
        
        #line default
        #line hidden
        
        
        #line 12 "..\..\..\gui\VentanaDialogo.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.TextBox TBConcepto;
        
        #line default
        #line hidden
        
        
        #line 14 "..\..\..\gui\VentanaDialogo.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.TextBox TBImporte;
        
        #line default
        #line hidden
        
        
        #line 15 "..\..\..\gui\VentanaDialogo.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Button BInsertar;
        
        #line default
        #line hidden
        
        
        #line 16 "..\..\..\gui\VentanaDialogo.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Button BCancelar;
        
        #line default
        #line hidden
        
        
        #line 17 "..\..\..\gui\VentanaDialogo.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Label LBError;
        
        #line default
        #line hidden
        
        private bool _contentLoaded;
        
        /// <summary>
        /// InitializeComponent
        /// </summary>
        [System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [System.CodeDom.Compiler.GeneratedCodeAttribute("PresentationBuildTasks", "4.0.0.0")]
        public void InitializeComponent() {
            if (_contentLoaded) {
                return;
            }
            _contentLoaded = true;
            System.Uri resourceLocater = new System.Uri("/IngresosGastos;component/gui/ventanadialogo.xaml", System.UriKind.Relative);
            
            #line 1 "..\..\..\gui\VentanaDialogo.xaml"
            System.Windows.Application.LoadComponent(this, resourceLocater);
            
            #line default
            #line hidden
        }
        
        [System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [System.CodeDom.Compiler.GeneratedCodeAttribute("PresentationBuildTasks", "4.0.0.0")]
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Never)]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Design", "CA1033:InterfaceMethodsShouldBeCallableByChildTypes")]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Maintainability", "CA1502:AvoidExcessiveComplexity")]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1800:DoNotCastUnnecessarily")]
        void System.Windows.Markup.IComponentConnector.Connect(int connectionId, object target) {
            switch (connectionId)
            {
            case 1:
            this.DPFecha = ((System.Windows.Controls.DatePicker)(target));
            
            #line 8 "..\..\..\gui\VentanaDialogo.xaml"
            this.DPFecha.AddHandler(System.Windows.Controls.Validation.ErrorEvent, new System.EventHandler<System.Windows.Controls.ValidationErrorEventArgs>(this.ValidarError));
            
            #line default
            #line hidden
            return;
            case 2:
            this.TBConcepto = ((System.Windows.Controls.TextBox)(target));
            
            #line 12 "..\..\..\gui\VentanaDialogo.xaml"
            this.TBConcepto.AddHandler(System.Windows.Controls.Validation.ErrorEvent, new System.EventHandler<System.Windows.Controls.ValidationErrorEventArgs>(this.ValidarError));
            
            #line default
            #line hidden
            return;
            case 3:
            this.TBImporte = ((System.Windows.Controls.TextBox)(target));
            
            #line 14 "..\..\..\gui\VentanaDialogo.xaml"
            this.TBImporte.AddHandler(System.Windows.Controls.Validation.ErrorEvent, new System.EventHandler<System.Windows.Controls.ValidationErrorEventArgs>(this.ValidarError));
            
            #line default
            #line hidden
            return;
            case 4:
            this.BInsertar = ((System.Windows.Controls.Button)(target));
            
            #line 15 "..\..\..\gui\VentanaDialogo.xaml"
            this.BInsertar.Click += new System.Windows.RoutedEventHandler(this.BInsertar_Click);
            
            #line default
            #line hidden
            return;
            case 5:
            this.BCancelar = ((System.Windows.Controls.Button)(target));
            
            #line 16 "..\..\..\gui\VentanaDialogo.xaml"
            this.BCancelar.Click += new System.Windows.RoutedEventHandler(this.BCancelar_Click);
            
            #line default
            #line hidden
            return;
            case 6:
            this.LBError = ((System.Windows.Controls.Label)(target));
            return;
            }
            this._contentLoaded = true;
        }
    }
}

